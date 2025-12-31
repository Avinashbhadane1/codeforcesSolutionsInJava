

import java.util.*;

public class date26Dec252 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            List<long[]> healthPts = new ArrayList<>();
            for(int i = 0;i<n;i++){
                long x = scanner.nextLong();
                healthPts.add(new long[]{x, (long) (i+1)});
            }
            for(long[] h:healthPts){
                h[0] = h[0]%k;
                if(h[0]==0){
                    h[0]=k;
                }
            }
            healthPts.sort((a, b) -> {
                if (a[0] != b[0]) {
                    return Long.compare(b[0], a[0]);
                }
                return Long.compare(a[1], b[1]);
            });
            for(long [] h: healthPts){
                System.out.print(h[1] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
