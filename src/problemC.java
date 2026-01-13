import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class problemC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            System.out.println(piler(n,k));
        }
        scanner.close();
    }
    private static long piler(long n, long k) {
        if (n == k) return 0;
        if (k > n) return -1;

        Set<Long> current = new HashSet<>();
        current.add(n);
        int minutes = 0;

        while (!current.isEmpty()) {
            minutes++;
            Set<Long> nextPiles = new HashSet<>();
            boolean found = false;

            for (long x : current) {
                long low = x / 2;
                long high = (x + 1) / 2;

                if (low == k || high == k) {
                    found = true;
                }

                if (low > k) nextPiles.add(low);
                if (high > k) nextPiles.add(high);
            }

            if (found) return minutes;
            current = nextPiles;
        }

        return -1;
    }
}
