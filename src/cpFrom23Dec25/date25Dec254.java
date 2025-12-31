

import java.util.Scanner;

public class date25Dec254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            boolean ok = false;

            long na = 2 * b - c;
            if (na > 0 && na % a == 0) ok = true;

            if ((a + c) % 2 == 0) {
                long nb = (a + c) / 2;
                if (nb > 0 && nb % b == 0) ok = true;
            }

            long nc = 2 * b - a;
            if (nc > 0 && nc % c == 0) ok = true;

            System.out.println(ok ? "YES" : "NO");
        }
        sc.close();
    }
}
