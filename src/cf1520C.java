import java.util.Scanner;

public class cf1520C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n == 2) {
                System.out.println(-1);
                continue;
            }

            int[][] mat = new int[n][n];
            int idx = 0;

            // Fill odds
            for (int x = 1; x <= n * n; x += 2) {
                mat[idx / n][idx % n] = x;
                idx++;
            }

            // Fill evens
            for (int x = 2; x <= n * n; x += 2) {
                mat[idx / n][idx % n] = x;
                idx++;
            }

            // Print
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
