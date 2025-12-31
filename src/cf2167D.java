import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cf2167D {
    static int[] primes = {
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
            31, 37, 41, 43, 47, 53
    };

    public static void main(String[] args) {
        // Use FastScanner for efficient input reading
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = fs.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = fs.nextLong();
            }

            long result = -1;

            for (int p : primes) {
                boolean allDivisible = true;
                for (long val : a) {
                    if (val % p != 0) {
                        allDivisible = false;
                        break;
                    }
                }

                if (!allDivisible) {
                    result = p;
                    break;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
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