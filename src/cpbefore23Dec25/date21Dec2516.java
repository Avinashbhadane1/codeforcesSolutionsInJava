package cpbefore23Dec25;

import java.util.Scanner;

public class date21Dec2516 {
    //1806A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int ops = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(d<b ){
                System.out.println(-1);
            }else{
                ops += d-b;
                a += ops;
                if(c>a){
                    System.out.println(-1);
                }else {
                    ops += Math.abs(c - a);
                    System.out.println(ops);
                }
            }
        }
        sc.close();
    }
}
