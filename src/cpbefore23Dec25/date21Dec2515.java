package cpbefore23Dec25;

import java.util.Scanner;

public class date21Dec2515 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            if(n%2==0 || (n-k)%2==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
