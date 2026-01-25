import java.util.*;

public class date23Jan262 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();

            ArrayList<long[]> val = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long c = sc.nextLong();
                val.add(new long[]{a * b - c, b, a});
            }

            val.sort(Comparator.comparingLong(v -> v[1]));

            long reachable = 0;

            for (int i = n - 1; i >= 0 && reachable < x; i--) {
                long b = val.get(i)[1];
                long a = val.get(i)[2];

                if (b == 1) break;

                reachable += a * (b - 1);
            }

            if (reachable >= x) {
                System.out.println(0);
                continue;
            }

            long best = 0;
            for (long[] v : val) {
                best = Math.max(best, v[0]);
            }

            if (best <= 0) {
                System.out.println(-1);
            } else {
                long remaining = x - reachable;
                System.out.println((remaining + best - 1) / best);
            }
        }

        sc.close();
    }
}
