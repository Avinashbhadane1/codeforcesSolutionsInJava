import java.util.Scanner;

public class beginnerZEN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();

            while (t-- > 0) {
                int n = scanner.nextInt();
                String row1 = scanner.next();
                String row2 = scanner.next();

                int ans = 0;

                for (int i = 0; i < n; i++) {
                    char c1 = row1.charAt(i);
                    char c2 = row2.charAt(i);

                    if (c1 != c2) {
                        ans += 2;
                    } else if (c1 == '0') {
                        if (i + 1 < n && row1.charAt(i+1) == '1' && row2.charAt(i+1) == '1') {
                            ans += 2;
                        } else {
                            ans += 1;
                        }
                    } else {
                        if (i + 1 < n && row1.charAt(i+1) == '0' && row2.charAt(i+1) == '0') {
                            ans += 2;
                            i++;
                        } else {
                        }
                    }
                }

                System.out.println(ans);
            }
        }
        scanner.close();
    }
}