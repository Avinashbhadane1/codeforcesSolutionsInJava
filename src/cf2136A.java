import java.util.Scanner;

public class cf2136A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            long d = scanner.nextLong();
            d -= b;
            c -= a;
            long x = Math.ceilDiv(Math.max(a,b),Math.min(a,b)+1);
            long y = Math.ceilDiv(Math.max(c,d),Math.min(c,d)+1);
            if(x<=2 && y<=2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
