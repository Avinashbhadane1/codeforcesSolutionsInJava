import java.util.Scanner;

public class cf1891B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int q = scanner.nextInt();
            long [] a = new long[n];
            long [] x = new long[q];
            for(int i = 0;i<n;i++){
                a[i] = scanner.nextLong();
            }
            for(int i = 0;i<q;i++){
                x[i] = scanner.nextLong();
            }
            long prev = 31;
            for(int i = 0;i<q;i++){
                if(x[i]>=prev) continue;
                long val = (long) Math.pow(2,x[i]);
                for(int j = 0;j<n;j++){
                    if(a[j]%val==0) {
                        a[j] += val / 2;
                    }
                }
                prev = x[i];
            }
            for(long l:a){
                System.out.print(l+ " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
