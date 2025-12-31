package cpbefore23Dec25;

import java.util.Scanner;

public class date22Dec255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            if(n/10==0){
                System.out.println(n);
            }else if(n/100==0){
                int fDigit = n/10;
                System.out.println(fDigit+9);
            }else if(n/1000 == 0){
                int fDigit = n/100;
                System.out.println(fDigit + 18);
            }else if(n/10000==0){
                int fDigit = n/1000;
                System.out.println(fDigit+27);
            }else if(n/100000==0){
                int fDigit = n/10000;
                System.out.println(fDigit+36);
            }else if(n/1000000==0){
                int fDigit = n/100000;
                System.out.println(fDigit + 45);
            }
        }
        sc.close();
    }
}
