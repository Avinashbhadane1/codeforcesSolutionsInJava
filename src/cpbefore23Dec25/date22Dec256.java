package cpbefore23Dec25;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class date22Dec256 {
//1904A
    static class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair p = (Pair) o;
            return x == p.x && y == p.y;
        }

        @Override
        public int hashCode() {
            return 31 * x + y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int xk = sc.nextInt();
            int yk = sc.nextInt();
            int xq = sc.nextInt();
            int yq = sc.nextInt();

            int[] dx = { a, a, -a, -a, b, b, -b, -b };
            int[] dy = { b, -b, b, -b, a, -a, a, -a };

            Set<Pair> king = new HashSet<>();
            Set<Pair> queen = new HashSet<>();

            for (int i = 0; i < 8; i++) {
                king.add(new Pair(xk + dx[i], yk + dy[i]));
                queen.add(new Pair(xq + dx[i], yq + dy[i]));
            }

            king.retainAll(queen);
            System.out.println(king.size());
        }

        sc.close();
    }
}
