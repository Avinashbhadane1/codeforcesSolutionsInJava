import java.util.Scanner;

public class date29Jan262 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            String s = scanner.next();
            int ones = 0;
            int first = -1;
            int last = -1;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    ones++;
                    if (first == -1) first = i;
                    last = i;
                }
            }
            if (ones == 0) {
                System.out.println((n + 2) / 3);
                continue;
            }

            int added = 0;

            added += (first + 1) / 3;

            int rightGap = n - 1 - last;
            added += (rightGap + 1) / 3;

            int currentGap = 0;
            for (int i = first + 1; i < last; i++) {
                if (s.charAt(i) == '0') {
                    currentGap++;
                } else {
                    added += currentGap / 3;
                    currentGap = 0;
                }
            }
            added += currentGap / 3;

            System.out.println(ones + added);
        }
        scanner.close();
    }
}
