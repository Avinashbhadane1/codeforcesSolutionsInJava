import java.util.ArrayList;
import java.util.Scanner;

public class date11Feb262 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int [] p = new int[n];
            int [] a = new int[n];
            for(int i = 0;i<n;i++){
                p[i] = scanner.nextInt();
            }
            for(int i = 0;i<n;i++){
                a[i] = scanner.nextInt();
            }
            int ap = 0;
            int pp = 0;
            while(ap<n && pp<n){
                if(a[ap]==p[pp]){
                    ap++;
                }else{
                    pp++;
                }
            }
            if(ap!=n-1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        scanner.close();
    }
}
