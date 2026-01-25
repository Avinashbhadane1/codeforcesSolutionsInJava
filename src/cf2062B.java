import java.util.Scanner;

public class cf2062B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int [] a = new int[n];
            int min = Integer.MAX_VALUE;
            boolean allSame = true;
            for (int i = 0;i<n;i++){
                a[i] = scanner.nextInt();
                min = Math.min(min,a[i]);
                if (i>0 && a[i]!=a[0]){
                    allSame = false;
                }
            }
            if(min<n || allSame){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }


        }
        scanner.close();
    }
}
