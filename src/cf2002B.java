import java.util.Scanner;

public class cf2002B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int []a = new int[n];
            int []b = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = scanner.nextInt();
            }
            for(int i = 0;i<n;i++){
                b[i] = scanner.nextInt();
            }
            int cEndA = n-1;
            int cEndB = n-1;
            int cStartA = 0;
            int cStartB = 0;
            int removed = 0;
            while (removed++<n){
                if(a[cEndA]==b[cEndB] && a[cStartA]==b[cStartA]|| a[cEndA]==b[cStartB] && a[cStartA]==b[cEndB] ){
                    cEndA--;
                    cStartB++;
                }else if(a[cStartA]==b[cStartB]|| a[cStartA]== b[cEndB]){
                    cEndA--;
                    
                }
            }
        }
        scanner.close();
    }
}
