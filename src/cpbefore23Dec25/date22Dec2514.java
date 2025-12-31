package cpbefore23Dec25;

import java.io.InputStream;
import java.io.IOException;

public class date22Dec2514 {

    static final class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private final InputStream in = System.in;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            boolean neg = false;
            if (c == '-') {
                neg = true;
                c = read();
            }

            long val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return neg ? -val : val;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder sb = new StringBuilder();

        int t = (int) fs.nextLong();

        while (t-- > 0) {
            int n = (int) fs.nextLong();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = fs.nextLong();
            }

            long ops = 0;
            boolean ok = true;

            for (int i = n - 2; i >= 0; i--) {
                if (a[i + 1] == 0 && a[i] > 0) {
                    ok = false;
                    break;
                }

                while (a[i] >= a[i + 1]) {
                    a[i] >>= 1;
                    ops++;

                    if (a[i] == 0) {
                        if (a[i + 1] == 0) {
                            ok = false;
                        }
                        break;
                    }
                }

                if (!ok) break;
            }

            sb.append(ok ? ops : -1).append('\n');
        }

        System.out.print(sb);
    }
}
