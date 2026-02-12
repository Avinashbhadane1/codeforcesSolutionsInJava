import java.util.Scanner;

public class cf1731B {
    static final long MOD = 1_000_000_007L;
    static final long INV6 = 166666668L;
    static final long INV3 = 333333336L;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            long n = scanner.nextLong();
            long a = n % MOD;
            long b = (n + 1) % MOD;
            long c = (2 * n + 1) % MOD;

            long sumSq = a * b % MOD * c % MOD * INV6 % MOD;
            long sumDiag = (n - 1 + MOD) % MOD * a % MOD * b % MOD * INV3 % MOD;

            long ans = (sumSq + sumDiag) % MOD;
            long result = ans * 2022 % MOD;
            System.out.println(result);
        }
        scanner.close();
    }
}
