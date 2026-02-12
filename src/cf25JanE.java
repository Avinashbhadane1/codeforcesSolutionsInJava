import java.util.Scanner;

public class cf25JanE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            long [] s = new long[n];
            for (int i = 0;i<n;i++){
                s[i] = scanner.nextLong();
            }
        }
        scanner.close();
    }
}
