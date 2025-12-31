
import java.util.Arrays;
import java.util.Scanner;

public class beginner_contestF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            long x = scanner.nextLong();
            long [] columnHeights = new long[n];
            for(int i = 0;i<n;i++){
                columnHeights[i] = scanner.nextLong();
            }
            long ans = 0;
            columnHeights  = Arrays.stream(columnHeights).sorted().toArray();
            for(int i = 1;i<=columnHeights[n-1];i++){
                long sum = 0;
                for(int j = 0;j<n;j++){
                    if(columnHeights[j]<i){
                        sum += columnHeights[j] -i;
                    }
                    if(sum<= x){
                        ans = Math.max(i,ans);
                    }
                }
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}
