import java.util.Arrays;
import java.util.Scanner;

public class cf2167C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            long [] a = new long[n];
            int countEven = 0;
            int countOdd = 0;
            for (int i = 0;i<n;i++){
                a[i] = scanner.nextLong();
                if(a[i]%2==0){
                    countEven++;
                }else{
                    countOdd++;
                }
            }
            if(countEven==0||countOdd==0){
                for(long i:a){
                    System.out.print(i + " ");
                }
                System.out.println();
            }else{
                a = Arrays.stream(a).sorted().toArray();
                for(long i:a){
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
