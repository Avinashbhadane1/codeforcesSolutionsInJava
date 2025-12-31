package cpbefore23Dec25;

import java.util.Arrays;
import java.util.Scanner;

public class date22Dec253 {
    //1783A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            int count = 1;
            int [] arr = new int[n];
            arr[0] = a1;
            for(int i = 0;i<n-1;i++){
                int x = sc.nextInt();
                if(x==a1){
                    count++;
                }
                arr[i+1] = x;
            }
            int[] sortedArray = Arrays.stream(arr)
                       .sorted()
                       .toArray();
            String output = count==n ? "NO":"YES";
            System.out.println(output);
            if(output.equals("YES")){
                if(sortedArray[n-1]==sortedArray[n-2]){
                    System.out.print(sortedArray[n-1] + " "+ sortedArray[0] + " "+ sortedArray[n-2] + " ");
                    while(n-->0){
                        if(n== sortedArray.length-1 || n== sortedArray.length-2 || n==0) continue;
                        System.out.print(sortedArray[n] + " ");
                    }
                }else{
                    while(n-->0){
                        System.out.print(sortedArray[n] + " ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
