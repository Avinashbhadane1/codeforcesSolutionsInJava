package cpbefore23Dec25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class data1Nov251 {
    public static int arraySum(int[] arr , int startIndex, int endIndex){
        int res = 0;
        for(int i = startIndex;i <= endIndex;i++){
            res += arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();
        result.add("0 0");
        int no_of_testCases = sc.nextInt();
        sc.nextLine();
        while(no_of_testCases!=0){
            int n = sc.nextInt();
            sc.nextLine();
            String text = sc.nextLine();
            String [] num = text.split(" ");
            int [] array = new int[num.length];
            for(int i = 0;i<n;i++){
                array[i] = Integer.parseInt(num[i]);
            }
            int l = 0;
            int r = n-1;

            if(n%2==0){
                for(int i = 0;i<n/2;i++){
                    for(int j = n;j>n/2;j--){
                        l = i;
                        r = j;
                        int s1 = arraySum(array,0,l);
                        int s2 , s3;
                        if(r==n){
                            s2 = arraySum(array,l+1,r-2);
                            s3 = arraySum(array,r-1,n-1);
                        }else{
                            s2 = arraySum(array,l+1,r-1);
                            s3 = arraySum(array,r,n-1);
                        }
                        System.out.println(s1);
                        System.out.println(s2);
                        System.out.println(s3);
                        if(((s1%3)==(s2%3)) && ((s2%3)==(s3%3)) || ((s1%3)!=(s2%3)) && ((s2%3)!=(s3%3))&& ((s1%3)!=(s3%3)) ){
                            result.set(0, (l+1) + " " + (r+1) );
                        }
                    }
                }
            }else{
                for(int i = 0;i<n/2;i++){
                    for(int j = n;j>n/2;j--){
                        l = i;
                        r = j;
                        int s1 = arraySum(array,0,l);
                        int s2 , s3;
                        if(r==n){
                            s2 = arraySum(array,l+1,r-2);
                            s3 = arraySum(array,r-1,n-1);
                        }else{
                            s2 = arraySum(array,l+1,r-1);
                            s3 = arraySum(array,r,n-1);
                        }
                        System.out.println(s1);
                        System.out.println(s2);
                        System.out.println(s3);
                        if(((s1%3)==(s2%3)) && ((s2%3)==(s3%3)) || ((s1%3)!=(s2%3)) && ((s2%3)!=(s3%3))&& ((s1%3)!=(s3%3)) ){
                            result.set(0, (l+1) + " " + (r+1) );
                        }
                    }
                }
            }
            no_of_testCases--;
        }
        System.out.println(result.getFirst());
    }
}
