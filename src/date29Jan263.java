import java.util.Arrays;
import java.util.Scanner;

public class date29Jan263 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                solve(sc);
            }
        }
        sc.close();
    }

    static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            minVal = Math.min(minVal,a[i]);
            maxVal = Math.max(maxVal,a[i]);
        }

        int[] b = a.clone();
        Arrays.sort(b);
        boolean sorted = true;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("-1");
            return;
        }
        int low = 1, high = 1_000_000_000;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(a, b, n, mid, minVal, maxVal)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }

    static boolean check(int[] a, int[] sortedA, int n, int k, int minVal, int maxVal) {
        for (int i = 0; i < n; i++) {
            boolean canSwapWithMin = (Math.abs(a[i] - minVal) >= k);
            boolean canSwapWithMax = (Math.abs(a[i] - maxVal) >= k);

            if (!canSwapWithMin && !canSwapWithMax) {
                if (a[i] != sortedA[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}