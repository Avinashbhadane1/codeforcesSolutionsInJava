import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class redo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int [] a = new int[n];
            Map<Integer,Integer> freq = new HashMap<>();
            for (int i = 0;i<n;i++){
                a[i] = scanner.nextInt();
                freq.put(a[i], freq.getOrDefault(a[i],0) + 1);
            }
            a = Arrays.stream(a).sorted().toArray();
            int [] ne = new int[n];
            for(int i = n-1;i>=0;i--){
                ne[i] = a[(n-1) - i];
            }
            if(freq.size()<2){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                if(ne[0]==ne[1]){
                    System.out.print(ne[0] + " "  + ne[n-1] + " ");
                    for(int i = 1;i<n-1;i++){
                        System.out.print(ne[i] + " ");
                    }
                }else{
                    for(int i = 0;i<n;i++){
                        System.out.print(ne[i] + " ");
                    }
                }

                System.out.println();
            }
        }
        scanner.close();
    }
}
