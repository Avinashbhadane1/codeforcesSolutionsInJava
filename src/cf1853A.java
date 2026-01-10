import java.util.Scanner;

public class cf1853A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            long [] a = new long[n];
            for(int i = 0;i<n;i++){
                a[i] = scanner.nextLong();
            }

            int minDiff = Integer.MAX_VALUE;
            for(int i = 0;i<n-1;i++){
                if(a[i]>a[i+1]){
                    minDiff=-1;
                    break;
                }else if(a[i]==a[i+1]){
                    minDiff=-2;
                }else{
                    int tem = (int)(a[i+1]-a[i]);
                    minDiff = Math.min(minDiff,tem);
                }
            }
            if(minDiff==-1){
                System.out.println(0);
            }else if(minDiff==-2){
                System.out.println(1);
            }else{
                System.out.println((minDiff/2) + 1);
            }
        }
        scanner.close();
    }
}
