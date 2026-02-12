import java.util.Scanner;

public class cf1826B {
    public static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static boolean check(long []a){
        for(int i = 0;i<a.length;i++){
            if(a[i]!=a[a.length-i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            long [] a = new long[n];
            for(int i =0;i<n;i++){
                a[i] = scanner.nextLong();
            }
            if(check(a)){
                System.out.println(0);
                continue;
            }
            long ans = Math.abs(a[0]-a[n-1]);
            for(int i = 1;i<n-1;i++){
                ans  = gcd(ans, Math.abs(a[i]-a[n-i-1]));
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}
