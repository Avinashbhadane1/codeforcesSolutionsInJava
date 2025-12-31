import java.util.Scanner;

public class beginnerH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            int ones = 0;
            while (ones < n && a[ones] == 1) {
                ones++;
            }

            if (ones == n) {
                System.out.println((n % 2 == 1) ? "First" : "Second");
            } else {
                System.out.println((ones % 2 == 0) ? "First" : "Second");
            }
        }
        sc.close();
    }
}
