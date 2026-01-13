import java.util.Scanner;

public class problemB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            long s = scanner.nextLong();
            long k = scanner.nextLong();
            long m = scanner.nextLong();
            if (s <= k) {
                long x = m%k;
                if(x<=s){
                    System.out.println(s-x);
                }else{
                    System.out.println(0);
                }
            }else{
                long x = m % (2 * k);

                if (x < k) {
                    System.out.println(s - x);
                } else {
                    long y = x - k;
                    System.out.println(k - y);
                }
            }
        }
        scanner.close();
    }
}
