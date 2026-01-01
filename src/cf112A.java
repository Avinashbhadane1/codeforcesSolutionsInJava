import java.util.Scanner;

public class cf112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next().toLowerCase();
        String t = sc.next().toLowerCase();

        int cmp = s.compareTo(t);

        if (cmp < 0) {
            System.out.println(-1);
        } else if (cmp > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
