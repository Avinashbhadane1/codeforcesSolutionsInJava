import java.util.Scanner;

public class beginnerD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();

                int[] count = new int[n + 1];

                for (int i = 0; i < n; i++) {
                    int val = sc.nextInt();
                    count[val]++;
                }
                long ways = 0;
                long smallerSticks = 0;

                for (int i = 0; i <= n; i++) {
                    long c = count[i];

                    if (c >= 3) {
                        ways += (c * (c - 1) * (c - 2)) / 6;
                    }

                    if (c >= 2) {
                        ways += (c * (c - 1) / 2) * smallerSticks;
                    }

                    smallerSticks += c;
                }

                System.out.println(ways);
            }
        }
        sc.close();
    }
}