import java.io.*;
import java.util.*;

public class eduE {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long k = sc.nextLong();
            int[] boxes = new int[m];
            for (int i = 0; i < m; i++) {
                boxes[i] = sc.nextInt();
            }

            Friend[] friends = new Friend[n];
            long sumY = 0;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();
                friends[i] = new Friend(i, x, z - y);
                sumY += y;
            }

            long remainingBudget = k - sumY;

            Arrays.sort(boxes);

            Arrays.sort(friends, (a, b) -> Integer.compare(a.x, b.x));

            PriorityQueue<Friend> pq = new PriorityQueue<>((a, b) -> Long.compare(b.c, a.c));

            boolean[] isBoxed = new boolean[n];
            int friendPtr = 0;
            int boxedCount = 0;

            for (int boxSize : boxes) {
                while (friendPtr < n && friends[friendPtr].x <= boxSize) {
                    pq.add(friends[friendPtr]);
                    friendPtr++;
                }
                if (!pq.isEmpty()) {
                    Friend lucky = pq.poll();
                    isBoxed[lucky.id] = true;
                    boxedCount++;
                }
            }

            ArrayList<Long> unboxedCosts = new ArrayList<>();
            for (Friend f : friends) {
                if (!isBoxed[f.id]) {
                    unboxedCosts.add((long)f.c);
                }
            }

            Collections.sort(unboxedCosts);

            int boughtCount = 0;
            for (long cost : unboxedCosts) {
                if (remainingBudget >= cost) {
                    remainingBudget -= cost;
                    boughtCount++;
                } else {
                    break;
                }
            }

            System.out.println(boxedCount + boughtCount);
        }
    }

    static class Friend {
        int id;
        int x;
        int c;

        public Friend(int id, int x, int c) {
            this.id = id;
            this.x = x;
            this.c = c;
        }
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }
}