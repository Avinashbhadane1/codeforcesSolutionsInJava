import java.util.Scanner;

public class cf2110B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String s = sc.nextLine();
            int balance = 0;
            boolean canSplit = false;

            for (int i = 0; i < s.length() - 1; i++) { // not full string
                if (s.charAt(i) == '(') balance++;
                else balance--;

                if (balance == 0) {
                    canSplit = true;
                    break;
                }
            }

            System.out.println(canSplit ? "YES" : "NO");
        }
        sc.close();
    }
}
