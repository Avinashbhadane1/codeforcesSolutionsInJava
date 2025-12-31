

import java.util.Scanner;

public class date25Dec259 {
    public static void main(String[] args) {
        //1559A
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(b>a){
                long temp = b;
                b=a;
                a= temp;
            }
            if(a==b){
                System.out.println(0 + " " + 0);
            }else{
                long gcd = a-b;
                long x = Math.min(b %gcd,gcd - b %gcd);
                System.out.println(gcd+ " " + x);
            }
        }
        sc.close();
    }
}
