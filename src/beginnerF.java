import java.util.Scanner;

public class beginnerF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            while (t-- > 0) {
                int n = scanner.nextInt();
                long x = scanner.nextLong();
                long[] a = new long[n];

                for (int i = 0; i < n; i++) {
                    a[i] = scanner.nextLong();
                }

                long low = 1;
                long high = 2_000_000_007L;
                long ans = 1;

                while (low <= high) {
                    long mid = low + (high - low) / 2;

                    long waterNeeded = 0;
                    for (long h : a) {
                        if (h < mid) {
                            waterNeeded += (mid - h);
                        }
                    }

                    if (waterNeeded <= x) {
                        ans = mid;
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }

                System.out.println(ans);
            }
        }
        scanner.close();
    }
}