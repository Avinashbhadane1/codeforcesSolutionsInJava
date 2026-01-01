import java.util.*;

public class beginnerT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] stations = new int[n];

            Map<Integer, Integer> first = new HashMap<>();
            Map<Integer, Integer> last = new HashMap<>();

            for (int i = 0; i < n; i++) {
                stations[i] = sc.nextInt();

                first.putIfAbsent(stations[i], i);

                last.put(stations[i], i);
            }

            while (k-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (!first.containsKey(a) || !last.containsKey(b)) {
                    System.out.println("NO");
                } else if (first.get(a) < last.get(b)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
