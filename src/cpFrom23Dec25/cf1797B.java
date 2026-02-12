package cpFrom23Dec25;

import java.io.*;
public class cf1797B {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            boolean evenFlag = n%2==0;
            int k = fs.nextInt();
            int[][] a = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = fs.nextInt();
                }
            }
            if(n==1){
                System.out.println("YES");
                continue;
            }

            int ops = 0;

            if(evenFlag) {
                for (int i = 0; i < n / 2; i++) {
                    for (int j = 0; j < n; j++) {
                        if (a[n - i - 1][n - j - 1] != a[i][j]) {
                            ops++;
                        }
                    }
                }
            }else{
                for (int i = 0; i <= n / 2; i++) {
                    if(i==n/2){
                        for (int j = 0; j <= n / 2; j++) {
                            if (a[n - i - 1][n - j - 1] != a[i][j]) {
                                ops++;
                            }
                        }
                    }else{
                        for (int j = 0; j < n; j++) {
                            if (a[n - i - 1][n - j - 1] != a[i][j]) {
                                ops++;
                            }
                        }
                    }
                }
            }

            if (ops > k) {
                System.out.println("NO");
            } else {
                System.out.println((k - ops) % 2 == 0 ? "YES" : "NO");
            }
        }
    }
}
class FastScanner {
    private final byte[] buffer = new byte[1 << 16];
    private int ptr = 0, len = 0;
    private final InputStream in = System.in;

    private int readByte() throws IOException {
        if (ptr >= len) {
            len = in.read(buffer);
            ptr = 0;
            if (len <= 0) return -1;
        }
        return buffer[ptr++];
    }

    int nextInt() throws IOException {
        int c, sign = 1, val = 0;
        do {
            c = readByte();
        } while (c <= ' ');

        if (c == '-') {
            sign = -1;
            c = readByte();
        }

        while (c > ' ') {
            val = val * 10 + (c - '0');
            c = readByte();
        }
        return val * sign;
    }
}