import java.util.Scanner;

public class cf2094A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            String s1 = scanner.next();
            String s2 = scanner.next();
            String s3 = scanner.next();
            System.out.println(String.valueOf(s1.charAt(0)) + s2.charAt(0) + s3.charAt(0));
        }
        scanner.close();
    }
}
