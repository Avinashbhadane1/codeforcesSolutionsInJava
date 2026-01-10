import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class cf469A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
            Set<Integer> all = new HashSet<>();
            int p = scanner.nextInt();
            for(int i = 0;i<p;i++){
                all.add(scanner.nextInt());
            }
            int q = scanner.nextInt();
            for(int i = 0;i<q;i++){
                all.add(scanner.nextInt());
            }
            if(all.size()==t){
                System.out.println("I become the guy.");
            }else{
                System.out.println("Oh, my keyboard!");
            }
        scanner.close();
    }
}
