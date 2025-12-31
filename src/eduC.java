import java.util.*;
import java.io.*;

public class eduC {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            for (int i = 0; i < n; i++) c[i] = sc.nextInt();

            long validAB = 0;
            for (int shift = 0; shift < n; shift++) {
                boolean possible = true;
                for (int m = 0; m < n; m++) {
                    if (a[m] >= b[(m + shift) % n]) {
                        possible = false;
                        break;
                    }
                }
                if (possible) validAB++;
            }

            long validBC = 0;
            for (int shift = 0; shift < n; shift++) {
                boolean possible = true;
                for (int m = 0; m < n; m++) {
                    if (b[m] >= c[(m + shift) % n]) {
                        possible = false;
                        break;
                    }
                }
                if (possible) validBC++;
            }
            System.out.println(validAB * validBC * n);
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
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
        int nextInt() { return Integer.parseInt(next()); }
    }
}