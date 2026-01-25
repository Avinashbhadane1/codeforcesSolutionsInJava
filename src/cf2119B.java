import java.util.*;

public class cf2119B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long px = sc.nextLong();
            long py = sc.nextLong();
            long qx = sc.nextLong();
            long qy = sc.nextLong();

            long sum = 0;
            long max = 0;

            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                sum += x;
                max = Math.max(max, x);
            }

            long dx = px - qx;
            long dy = py - qy;
            long distSq = dx*dx + dy*dy;

            long minReach = Math.max(0, max - (sum - max));
            long minReachSq = minReach * minReach;
            long maxReachSq = sum * sum;

            if (distSq >= minReachSq && distSq <= maxReachSq) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
