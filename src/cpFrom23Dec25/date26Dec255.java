import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class date26Dec255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Set<Character> set = new HashSet<>();
            long[] prefix = new long[n+1];
            long[] suffix = new long[n+1];
            for(int i = 1;i<=s.length();i++){
                set.add(s.charAt(i-1));
                prefix[i] = set.size();
            }
            set.clear();
            for(int i = n;i>=1;i--){
                set.add(s.charAt(i-1));
                suffix[i] = set.size();
            }
            long ans = 0;
            for (int i = 0;i<n;i++){
                ans = Math.max(ans,prefix[i] + suffix[i+1]);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
