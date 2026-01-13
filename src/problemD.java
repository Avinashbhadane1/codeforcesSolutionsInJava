import java.util.Scanner;

public class problemD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long aliceCanWinMax;

            if (k >= 31) {
                aliceCanWinMax = n;
            } else {
                aliceCanWinMax = (1L << k) - 1;
            }

            long bobWins = n - aliceCanWinMax;

            if (bobWins < 0) {
                System.out.println(0);
            } else {
                System.out.println(bobWins);
            }
        }
        sc.close();
    }
}