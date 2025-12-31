package cpbefore23Dec25;

import java.util.Scanner;

public class date22Dec258 {
    //1878C
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long min = 0;
            long max = 0;
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();
            min = k * (k + 1) / 2;
            max = k * (2 * n - k + 1) / 2;
            if(x>= min && x<= max){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
