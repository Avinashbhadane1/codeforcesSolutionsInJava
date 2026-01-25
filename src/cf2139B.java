import java.util.Arrays;
import java.util.Scanner;

public class cf2139B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            long [] ovens = new long[n];
            for(int i = 0;i<n;i++){
                ovens[i] = scanner.nextLong();
            }
            ovens = Arrays.stream(ovens).sorted().toArray();
            long cakes = 0;
            int index = n-1;
            while(m>0 && index>=0){
                cakes += m*ovens[index];
                index--;
                m--;
            }
            System.out.println(cakes);
        }
        scanner.close();
    }
}
