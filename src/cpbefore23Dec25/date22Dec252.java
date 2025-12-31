package cpbefore23Dec25;

import java.util.Scanner;

public class date22Dec252 {
    //1789A
    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            boolean isBeautiful = false;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0;i<n;i++){
                for(int j = i+1;j<n;j++){
                    if (findGCD(arr[i], arr[j]) <= 2) {
                        isBeautiful = true;
                        break;
                    }
                }
            }
            String output = isBeautiful?"Yes":"No";
            System.out.println(output);
        }
        sc.close();
    }
}
