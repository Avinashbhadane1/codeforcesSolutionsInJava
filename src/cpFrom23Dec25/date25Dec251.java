

import java.util.Scanner;

public class date25Dec251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long n = sc.nextLong();
            if(n%2!=0 || n<4) {
                System.out.println(-1);
            }else{
                System.out.println((n+5)/ 6 + " " + n / 4);
            }
        }
        sc.close();
    }
}
