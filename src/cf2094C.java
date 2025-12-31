import java.util.*;

public class cf2094C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];

            int maxVal = n * n + 1;
            boolean[] present = new boolean[maxVal + 1];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                    present[a[i][j]] = true;
                }
            }

            int missing = 0;
            for (int i = 1; i <= maxVal; i++) {
                if (!present[i]) {
                    missing = i;
                    break;
                }
            }

            System.out.print(missing + " ");

            boolean[] used = new boolean[maxVal + 1];

            for (int j = 0; j < n; j++) {
                System.out.print(a[0][j] + " ");
                used[a[0][j]] = true;
            }

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!used[a[i][j]]) {
                        System.out.print(a[i][j] + " ");
                        used[a[i][j]] = true;
                        break;
                    }
                }
            }

            System.out.println();
        }
        sc.close();
    }
}
