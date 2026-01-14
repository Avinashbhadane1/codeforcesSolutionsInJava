import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class virtual1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            long n = scanner.nextLong();
            long j = scanner.nextLong();
            long k = scanner.nextLong();
            long person = -1;
            ArrayList<Long> num = new ArrayList<>();
            for(int i = 0;i<n;i++){
                long x = scanner.nextLong();
                if(i+1==j){
                    person = x;
                }
                num.add(x);
            }
            List<Long> next = new ArrayList<>();
            for(int i = 0;i<n;i++){
                if(!next.contains(num.get(i))){
                    next.add(num.get(i));
                }
            }
            boolean flag = false;
            next = next.stream().sorted().toList();
            for(int i = (int)next.size()-1;i>=n-k;i--){
                if (next.get(i) == person) {
                    flag = true;
                    break;
                }
            }
            String output = flag ? "YES":"NO";
            System.out.println(output);
        }
        scanner.close();
    }
}
