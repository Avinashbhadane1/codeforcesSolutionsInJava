import java.util.*;

public class cf1827A {
    private static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }

    private static void solve(Scanner scanner) {
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        Arrays.sort(b);
        for (int i = 0; i < n / 2; i++) {
            int temp = b[i];
            b[i] = b[n - i - 1];
            b[n - i - 1] = temp;
        }

        long result = 1;

        for (int i = 0; i < n; i++) {
            int temp = upperBound(a, b[i]);
            long count = a.length - temp;

            result = result * Math.max(count - i, 0) % MOD;
        }

        System.out.println(result);
    }

    private static int upperBound(int[] array, int value) {
        int low = 0, high = array.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (array[mid] <= value) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}

// Time Complexity (TC): O(nlogn)
// Space Complexity (SC): O(n)
