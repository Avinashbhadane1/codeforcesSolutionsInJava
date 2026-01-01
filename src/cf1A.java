import java.util.Scanner;

public class cf1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long stonesN = (n + a - 1) / a;
        long stonesM = (m + a - 1) / a;

        System.out.println(stonesN * stonesM);
    }
}
