import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class beginnerE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }

            for (int k = 1; k <= 60; k++) {
                long mod = 1L << k;
                Set<Long> remainders = new HashSet<>();

                for (long val : a) {
                    remainders.add(val % mod);
                    if (remainders.size() > 2) break;
                }

                if (remainders.size() == 2) {
                    System.out.println(mod);
                    break;
                }
            }
        }
        scanner.close();
    }
}