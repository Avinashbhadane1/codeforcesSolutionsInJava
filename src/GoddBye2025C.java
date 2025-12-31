
import java.util.Scanner;

public class GoddBye2025C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextLong();
            }

            if (n == 2) {
                System.out.println(Math.max(a[1], -a[2]));
                continue;
            }

            long[] dp = new long[n + 1];
            dp[1] = 0;
            dp[2] = Math.max(a[1], -a[2]);

            for (int i = 3; i <= n; i++) {
                dp[i] = Math.max(
                        dp[i - 1] + a[i - 1],
                        dp[i - 2] - a[i - 1]
                );
            }

            System.out.println(Math.max(dp[n], dp[n - 1]));
        }

        sc.close();
    }
}
