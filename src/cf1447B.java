
import java.util.Scanner;

public class cf1447B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int [][]  a  =new int[n][m];
            int neg = 0;
            int minNeg = Integer.MAX_VALUE;
            int sum = 0;
            boolean hasZero = false;
            for(int i = 0;i<n;i++){
                for(int j = 0;j<m;j++){
                    a[i][j] = scanner.nextInt();
                    if(a[i][j]==0){
                       hasZero = true;
                    }else{
                        int temp = Math.abs(a[i][j]);
                        minNeg = Math.min(minNeg,temp);
                    }
                    sum += Math.abs(a[i][j]);
                    if(a[i][j]<0){
                        neg++;
                    }
                }
            }
            if(hasZero){
                System.out.println(sum);
            }else{
                if(neg%2==0){
                    System.out.println(sum);
                }else{
                    System.out.println(sum - 2*minNeg);
                }
            }
        }
        scanner.close();
    }
}
