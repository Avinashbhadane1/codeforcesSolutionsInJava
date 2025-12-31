import java.util.*;

public class massHysteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            int killsNeeded = n - m;

            if (m == 0 || (n == 3 && m == 0)) {
                System.out.println("-1");
                continue;
            }

            System.out.println(killsNeeded);
            for (int i = 1; i <= killsNeeded; i++) {
                System.out.println(i + " " + (i + 1));
            }
        }
        sc.close();
    }
}