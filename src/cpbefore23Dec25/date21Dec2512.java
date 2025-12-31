package cpbefore23Dec25;

import java.util.Scanner;

public class date21Dec2512 {
    //1834A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            int neg = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                sum += x;
                if (x == -1) neg++;
            }

            int ops = 0;

            if (sum < 0) {
                int need = (-sum + 1) / 2;
                ops += need;
                neg -= need;
                sum += 2 * need;
            }

            if (neg % 2 != 0) {
                ops++;
            }

            System.out.println(ops);
        }

        sc.close();
    }
}
