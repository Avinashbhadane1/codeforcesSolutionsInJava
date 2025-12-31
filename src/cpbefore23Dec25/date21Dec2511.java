package cpbefore23Dec25;

import java.util.Scanner;

public class date21Dec2511 {
    //1837A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int x = sc.nextInt();
            int k = sc.nextInt();
            if(x<k){
                System.out.println(1);
                System.out.println(x);
            }else if(x==k){
                System.out.println(2);
                System.out.println(k-1 + " " + 1);
            }else{
                if(x%k!=0){
                    System.out.println(1);
                    System.out.println(x);
                }else{
                    System.out.println(2);
                    System.out.println(x-1 + " " + 1);
                }
            }
        }
        sc.close();
    }
}
