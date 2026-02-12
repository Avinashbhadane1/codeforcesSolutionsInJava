import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class cf2183B {
    public static long findMex(long[] nums) {
        // Use a Set for O(1) average time complexity lookups
        Set<Long> set = new HashSet<>();
        for (long num : nums) {
            // Only add non-negative numbers to the set, as MEX is non-negative
            if (num >= 0) {
                set.add(num);
            }
        }

        // Iterate from 0 upwards to find the first missing non-negative integer
        long mex = 0;
        while (set.contains(mex)) {
            mex++;
        }

        return mex;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            long [] a = new long[n];
            for(int i = 0;i<n;i++){
                a[i] = scanner.nextLong();
            }
            long ans = 0;
            int index = 0;
            long [] b = new long[k];
            for(int i = 0;i<=n-k;i++){
                int count = 0;
                for(int j = i;j<k;j++){
                    b[count] = a[j];
                    count++;
                }
                if(findMex(b)>=ans){
                    index = i;
                    ans = findMex(b);
                }
            }
            int count = 0;
            for(int i = index;i<k;i++){
                b[count] = a[i];
                count++;
            }
            b = Arrays.stream(b).sorted().toArray();
            b[0] = b[k-1];
            System.out.println(findMex(b));
        }
        scanner.close();
    }
}
