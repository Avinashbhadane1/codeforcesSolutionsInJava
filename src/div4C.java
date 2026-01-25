import java.util.*;

public class div4C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            long maxMex = 0;
            for (int i = 0; i < n; i++) {
                long shift = -a[i];
                Set<Long> current = new HashSet<>();
                for (long val : a) {
                    long shiftedVal = val + shift;
                    if (shiftedVal >= 0 && shiftedVal <= n) {
                        current.add(shiftedVal);
                    }
                }
                long currentMex = 0;
                while (current.contains(currentMex)) {
                    currentMex++;
                }

                maxMex = Math.max(maxMex, currentMex);
            }
            System.out.println(maxMex);
        }
    }
}