

import java.util.Scanner;

public class date24Dec255 {
    public static void main(String[] args) {
        //1726A
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            long [] a = new long[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextLong();
            }
            long answer = a[n -1] - a[0];
            for(int i = 1;i<n;i++){
                answer = Math.max(answer,a[i]-a[0]);
            }
            for(int i = 0;i<n-1;i++){
                answer = Math.max(answer,a[n-1] -a[i]);
            }
            for(int i = 0;i<n-1;i++){
                answer = Math.max(answer,a[i]-a[i+1]);
            }
            System.out.println(answer);
        }
        sc.close();
    }
}
