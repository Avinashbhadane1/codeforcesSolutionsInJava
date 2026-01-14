import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cf2133A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            boolean possible  = false;
            Map<Integer,Integer> freq = new HashMap<>();
            for(int i = 0;i<n;i++){
                int x = scanner.nextInt();
                freq.put(x,freq.getOrDefault(x,0)+1);
            }
            for(int val: freq.values()){
                if(val>=2){
                    possible = true;
                    break;
                }
            }
            String output = possible?"YES":"NO";
            System.out.println(output);
        }
        scanner.close();
    }
}
