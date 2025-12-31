import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cf1690DN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();
            List<long[]> ranges = new ArrayList<>();
            long counter = 0;
            for(int i = 0;i<n;i++){
                if(s.charAt(i)=='B'){
                    counter++;
                }else{
                    if(counter!=0) {
                        ranges.add(new long[]{i - counter, i - 1});
                        counter = 0;
                    }
                }
            }
            long ans = 0;
            long ops = 0;
            long current = -1;
            for(long[] h : ranges){
                long l = h[0];
                long r = h[1];
                if(current!=-1){
                    ops += l-current-1;
                }
                ans += (r-l) + 1;
                if(ans>=k){
                    System.out.println(ops);
                    break;
                }
                current = r;
            }
        }
        scanner.close();
    }
}
