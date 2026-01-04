import java.util.Scanner;

public class cf1506C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String a = sc.nextLine();
            String b = sc.nextLine();

            int n = a.length();
            int m = b.length();
            int maxCommon = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int len = 0;
                    while (i + len < n && j + len < m &&
                            a.charAt(i + len) == b.charAt(j + len)) {
                        len++;
                        maxCommon = Math.max(maxCommon, len);
                    }
                }
            }

            System.out.println(n + m - maxCommon*2);
        }
        sc.close();
    }
}
