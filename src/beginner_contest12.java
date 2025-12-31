import java.util.*;

public class beginner_contest12 {
    static class Pair {
        int val, idx;
        Pair(int v, int i) {
            val = v;
            idx = i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];

            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();
            for (int i = 0; i < n; i++) c[i] = sc.nextInt();

            List<Pair> A = new ArrayList<>();
            List<Pair> B = new ArrayList<>();
            List<Pair> C = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                A.add(new Pair(a[i], i));
                B.add(new Pair(b[i], i));
                C.add(new Pair(c[i], i));
            }

            A.sort((x, y) -> y.val - x.val);
            B.sort((x, y) -> y.val - x.val);
            C.sort((x, y) -> y.val - x.val);

            long ans = 0;

            for (int i = 0; i < 3 && i < A.size(); i++) {
                for (int j = 0; j < 3 && j < B.size(); j++) {
                    for (int k = 0; k < 3 && k < C.size(); k++) {
                        int ia = A.get(i).idx;
                        int ib = B.get(j).idx;
                        int ic = C.get(k).idx;

                        if (ia != ib && ib != ic && ia != ic) {
                            long sum = (long) A.get(i).val
                                    + B.get(j).val
                                    + C.get(k).val;
                            ans = Math.max(ans, sum);
                        }
                    }
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
