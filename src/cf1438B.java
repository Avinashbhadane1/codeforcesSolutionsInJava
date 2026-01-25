import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cf1438B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            Map<Long,Long> fre = new HashMap<>();
            long [] a  =new long[n];
            for(int i = 0;i<n;i++){
                a[i]= scanner.nextLong();
                fre.put(a[i],fre.getOrDefault(a[i],0L)+1);
            }
            if(fre.size()!=n){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
