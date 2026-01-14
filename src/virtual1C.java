
import java.util.Scanner;

public class virtual1C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int [] array = new int[n];
            StringBuilder builder = new StringBuilder();
            for(int i = 0;i<n;i++){
                array[i] = scanner.nextInt();
            }
            int [] pre = new int[n];
            int [] suf = new int[n];
            pre[0] = array[0];
            for(int i = 1;i<n;i++){
                pre[i] = Math.max(pre[i-1],array[i]);
            }
            suf[n-1] = array[n-1];
            for(int i = n-2;i>=0;i--){
                suf[i] = Math.min(suf[i+1],array[i]);
            }
            for(int i = 0;i<n;i++){
                boolean ok = true;
                if(i>0 && pre[i-1] >array[i]) ok = false;
                if(i<n-1 && suf[i+1] <array[i]) ok = false;
                builder.append(ok?"1":"0");
            }
            System.out.println(builder);
        }
        scanner.close();
    }
}
