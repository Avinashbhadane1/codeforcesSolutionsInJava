import java.util.Scanner;

public class cf1360A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            long a  = scanner.nextLong();
            long b  = scanner.nextLong();
            if (a < b) {
                long temp = a;
                a = b;
                b = temp;
            }
            System.out.println(Math.max(a,2*b)*Math.max(a,2*b));
        }
        scanner.close();
    }
}
