import java.util.Scanner;

public class date25Dec2512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();

            long max = 0;
            long sum = 0;

            for (int i = 0; i < n; i++) {
                long k = sc.nextLong();
                max += (k + x - 1) / x;
                sum += k;
            }

            long min = (sum + x - 1) / x;

            System.out.println(min + " " + max);
        }

        sc.close();
    }
}
