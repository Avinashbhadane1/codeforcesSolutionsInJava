import java.util.*;

public class GoodBye2025B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            char[] r = sc.next().toCharArray();
            int n = r.length;
            int ops = 0;

            if (r[0] == 'u') {
                r[0] = 's';
                ops++;
            }
            if (r[n - 1] == 'u') {
                r[n - 1] = 's';
                ops++;
            }
            for (int i = 0; i < n - 1; i++) {
                if (r[i] == 'u' && r[i + 1] == 'u') {
                    r[i + 1] = 's';
                    ops++;
                }
            }
            int sCount = 0;
            for (char c : r) if (c == 's') sCount++;

            if (sCount < 2) {
                ops += (2 - sCount);
            }

            System.out.println(ops);
        }
        sc.close();
    }
}