import java.util.Scanner;

public class date25Jan263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int q = scanner.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (a[i] < b[i]) {
                    a[i] = b[i];
                }
            }

            for (int i = n - 1; i > 0; i--) {
                if (a[i] > a[i - 1]) {
                    a[i - 1] = a[i];
                }
            }

            long[] pref = new long[n];
            pref[0] = a[0];
            for (int i = 1; i < n; i++) {
                pref[i] = pref[i - 1] + a[i];
            }

            while (q-- > 0) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                long sum;
                if (x == 1) {
                    sum = pref[y - 1];
                } else {
                    sum = pref[y - 1] - pref[x - 2];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
