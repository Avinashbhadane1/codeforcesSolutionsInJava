import java.util.Scanner;

public class beginner_contestC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();
            int n = s.length();
            boolean possible = false;

            for (int k = 0; k <= n; k++) {
                boolean patternL = false;
                for (int i = 0; i + 1 < k; i++) {
                    if (s.charAt(i) == '1' && s.charAt(i + 1) == '1') {
                        patternL = true;
                        break;
                    }
                }

                boolean patternR = false;
                for (int i = k; i + 1 < n; i++) {
                    if (s.charAt(i) == '0' && s.charAt(i + 1) == '0') {
                        patternR = true;
                        break;
                    }
                }

                if (!patternL && !patternR) {
                    possible = true;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
}
