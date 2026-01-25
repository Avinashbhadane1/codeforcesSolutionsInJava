import java.util.Scanner;

public class div4D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long h = sc.nextLong();

            long[] original = new long[n];
            long[] a = new long[n];
            int[] l = new int[n];

            for (int i = 0; i < n; i++) {
                original[i] = sc.nextLong();
                a[i] = original[i];
                l[i] = 0;
            }
            int time = 0;
            int reset = 0;

            for (int i = 0; i < m; i++) {
                int b = sc.nextInt() - 1;
                long c = sc.nextLong();
                time++;
                if (l[b] <= reset) {
                    a[b] = original[b];
                }
                a[b] += c;
                l[b] = time;
                if (a[b] > h) {
                    reset = time;
                }
            }

            for (int i = 0; i < n; i++) {
                if (l[i] <= reset) {
                    System.out.print(original[i] + " ");
                } else {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
