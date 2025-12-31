import java.util.Scanner;

public class beginnerK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            int last = 61;

            for (int i = 0; i < q; i++) {
                int k = sc.nextInt();

                if (k < last) {
                    long mod = 1L << k;
                    long add = 1L << (k - 1);

                    for (int j = 0; j < n; j++) {
                        if (a[j] % mod == 0) {
                            a[j] += add;
                        }
                    }
                    last = k;
                }
            }

            for (long x : a) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
