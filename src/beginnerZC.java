import java.util.Scanner;

public class beginnerZC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                long[] a = new long[n];

                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextLong();
                }

                long d = a[1] - a[0];
                boolean isAP = true;

                for (int i = 0; i < n - 1; i++) {
                    if (a[i+1] - a[i] != d) {
                        isAP = false;
                        break;
                    }
                }

                if (!isAP) {
                    System.out.println("NO");
                    continue;
                }

                long numerator = a[0] - d;
                long denominator = n + 1;

                if (numerator % denominator != 0) {
                    System.out.println("NO");
                    continue;
                }

                long y = numerator / denominator;

                long x = y + d;

                if (x >= 0 && y >= 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}