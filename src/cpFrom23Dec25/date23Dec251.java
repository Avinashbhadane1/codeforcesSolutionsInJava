package cpFrom23Dec25;

import java.util.Scanner;

public class date23Dec251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            long sec = 0;
            for(int i = 0;i<n;i++){
                long x = sc.nextLong();
                sec += Math.min(x,a-1);
            }
            System.out.println(sec+b);
        }
        sc.close();
    }
}
