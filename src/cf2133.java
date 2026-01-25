import java.util.Arrays;
import java.util.Scanner;

public class cf2133 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int [] a  =new int[n];
            for(int i = 0;i<n;i++){
                a[i] = scanner.nextInt();
            }
            a = Arrays.stream(a).sorted().toArray();
            long emeralds;
            if(n%2==0){
                emeralds = 0;
                for(int i = n-1;i>0;i = i-2){
                    emeralds += Math.max(a[i],a[i-1]);
                }
            }else{
                emeralds = a[0];
                for(int i = n-1;i>0;i=i-2){
                    emeralds += Math.max(a[i],a[i-1]);
                }
            }
            System.out.println(emeralds);
        }
        scanner.close();
    }
}
