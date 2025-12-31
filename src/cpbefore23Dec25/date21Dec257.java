package cpbefore23Dec25;

import java.util.Scanner;

public class date21Dec257 {
    //1858A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            if(c%2==0){
                a += c/2;
                b += c/2;
            }else{
                a += (c-1)/2 + 1;
                b += (c-1)/2;
            }
            if(a>b){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
        }
    }
}
