import java.util.Scanner;

public class cf1418A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long k = scanner.nextLong();
            long sticks = k*y + k-1;
            long sticksG = x-1;
            long trade = 0;
            trade += Math.ceilDiv(sticks,sticksG);
            trade += k;

            System.out.println(trade);
        }
        scanner.close();
    }
}
