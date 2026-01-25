import java.util.Scanner;

public class div4B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int [] a = new int[n];
            int max = Integer.MIN_VALUE;
            for(int i = 0;i<n;i++){
                a[i] = scanner.nextInt();
                max = Math.max(max,a[i]);
            }
            System.out.println(max*n);
        }
        scanner.close();
    }
}
