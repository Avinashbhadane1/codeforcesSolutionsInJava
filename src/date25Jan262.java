import java.util.Scanner;

public class date25Jan262 {
    public static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n + 1];
            int[] pos = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                p[i] = sc.nextInt();
                pos[p[i]] = i;
            }

            for (int i = 1; i <= n; i++) {
                int target = n - i + 1;

                if (p[i] != target) {
                    int targetIndex = pos[target];
                    reverse(p, i, targetIndex);
                    break;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                sb.append(p[i]).append(" ");
            }
            System.out.println(sb);
        }
        sc.close();
    }
}
