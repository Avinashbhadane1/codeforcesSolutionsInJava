import java.util.Scanner;

public class beginner_contest11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();
            if (c == 'g') {
                System.out.println(0);
                continue;
            }

            String s2 = s + s;

            int length = 2 * n;
            int[] nextG = new int[length];
            int next = Integer.MAX_VALUE;
            for (int i = length - 1; i >= 0; i--) {
                if (s2.charAt(i) == 'g') {
                    next = i;
                }
                nextG[i] = next;
            }

            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == c) {
                    ans = Math.max(ans, nextG[i] - i);
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
