
import java.util.Scanner;

public class date25Dec255 {//1607B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long n = sc.nextLong();

            long r = n % 4;
            boolean xEven = (x & 1) == 0;

            long ans;
            if (xEven) {
                if (r == 0) ans = x;
                else if (r == 1) ans = x - n;
                else if (r == 2) ans = x + 1;
                else ans = x + n + 1;
            } else {
                if (r == 0) ans = x;
                else if (r == 1) ans = x + n;
                else if (r == 2) ans = x - 1;
                else ans = x - n - 1;
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
