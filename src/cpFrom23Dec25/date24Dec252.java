

import java.util.Scanner;

public class date24Dec252 {
    public static int gcd(int a , int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    //1828B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int ans = 0;
            int n = sc.nextInt();
            for(int i = 1;i<=n;i++){
                int x = sc.nextInt();
                int k = Math.abs(x-i);
                if(k>0){
                   ans = gcd(ans,k);
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
