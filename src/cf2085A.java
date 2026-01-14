import java.util.Scanner;

public class cf2085A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            String rev = new StringBuilder(s).reverse().toString();

            // Case 1: already good
            if (s.compareTo(rev) < 0) {
                System.out.println("YES");
                continue;
            }

            // Case 2: can reverse one substring
            boolean allSame = true;
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) != s.charAt(0)) {
                    allSame = false;
                    break;
                }
            }

            if (k > 0 && !allSame) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
