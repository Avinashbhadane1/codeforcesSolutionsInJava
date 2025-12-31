import java.util.*;
import java.io.*;

public class eduD {
    static final long MOD = 998244353;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int t = sc.nextInt();

        long[] fact = new long[55];
        fact[0] = 1;
        for (int i = 1; i <= 50; i++) fact[i] = (fact[i - 1] * i) % MOD;

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n + 1];
            long sum = 0;
            for (int i = 0; i <= n; i++) {
                a[i] = sc.nextLong();
                sum += a[i];
            }
            long k = sum / n;
            long r = sum % n;
            int criticalCount = 0;
            boolean possible = true;

            for (int i = 1; i <= n; i++) {
                if (a[i] > k + 1) {
                    possible = false;
                    break;
                }
                if (a[i] == k + 1) {
                    criticalCount++;
                }
            }
            if (!possible || criticalCount > r) {
                System.out.println(0);
                continue;
            }
            long ans = 1;

            for (int i = 0; i < criticalCount; i++) {
                ans = (ans * (r - i)) % MOD;
            }

            ans = (ans * fact[n - criticalCount]) % MOD;

            System.out.println(ans);
        }
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }
}