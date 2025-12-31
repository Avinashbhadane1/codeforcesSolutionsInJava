import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beginnerM {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long l = sc.nextLong();
            long r = sc.nextLong();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            int[] dp = new int[n + 1];

            int start = 0;
            long currentSum = 0;

            for (int i = 0; i < n; i++) {
                dp[i + 1] = dp[i];

                currentSum += a[i];

                while (start <= i && (currentSum > r || (currentSum >= l && currentSum - a[start] >= l))) {
                    currentSum -= a[start];
                    start++;
                }

                if (currentSum >= l && currentSum <= r) {
                    dp[i + 1] = Math.max(dp[i + 1], dp[start] + 1);
                }
            }

            System.out.println(dp[n]);
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}