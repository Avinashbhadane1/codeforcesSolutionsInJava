import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class cf1899B {
    public static List<Integer> findAllDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i * i != n) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            List<Integer> k = findAllDivisors(n);
            k.add(n);
            long [] a = new long[n];
            long maxA = Long.MIN_VALUE;
            long minA = Long.MAX_VALUE;
            for(int i = 0;i<n;i++){
                a[i] = scanner.nextLong();
                maxA = Math.max(maxA,a[i]);
                minA = Math.min(minA,a[i]);
            }
//            a = Arrays.stream(a).sorted().toArray();
            long diff= 0;
            System.out.println("n: " + n);
            for(int i = 0;i<k.size();i++){
                long lSum = 0;
                long rSum = 0;
                System.out.println("element in k: "  + k.get(k.size()-i-1));
                int partitions = n/k.get(k.size()-i-1);
                System.out.println("partitions: " + partitions);
                for(int j = 0;j<partitions;j++){
                    lSum += a[j];
                }
                System.out.println("lsum: " + lSum);
                for(int j = n-partitions;j<n;j++){
                    rSum += a[j];
                }
                System.out.println("rsum: " + rSum);

                diff = Math.max(diff, rSum-lSum);
                System.out.println("diff  = " + diff);
            }
            diff = Math.max(diff,maxA-minA);
            System.out.println(diff);
        }
        scanner.close();
    }
}
