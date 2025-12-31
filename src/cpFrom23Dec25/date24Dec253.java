

import java.util.Scanner;

public class date24Dec253 {
    //1807D
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int q  =sc.nextInt();
            long[] arr = new long[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            long[] prefixSum = new long[n+1];
            for(int i = 1;i<=n;i++){
                prefixSum[i] = prefixSum[i-1] + arr[i-1];
            }
            long oldSum = prefixSum[n];
            while(q-->0){
                long l = sc.nextLong();
                long r = sc.nextLong();
                long k = sc.nextLong();

                long sumToReplace = prefixSum[(int) r] - prefixSum[(int) l-1];
                long sumToAdd = (r-l+1)*k;
                long total = oldSum - sumToReplace + sumToAdd;
                if(total%2!=0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
