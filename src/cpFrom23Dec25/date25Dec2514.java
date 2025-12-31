import java.util.Scanner;

public class date25Dec2514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            long[] array = new long[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextLong();
            }

            long ans = Long.MAX_VALUE;
            int even = 0;

            for (int i = 0; i < n; i++) {
                if (array[i] % 2 == 0) even++;

                long mod = array[i] % k;
                if (mod == 0) {
                    ans = 0;
                } else {
                    ans = Math.min(ans, k - mod);
                }
            }

            if (k == 4) {
                if (even >= 2) ans = Math.min(ans, 0);
                else if (even == 1) ans = Math.min(ans, 1);
                else ans = Math.min(ans, 2);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
