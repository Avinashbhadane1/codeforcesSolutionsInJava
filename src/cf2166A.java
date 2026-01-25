import java.util.Scanner;

public class cf2166A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            String s = scanner.next();
            char c = s.charAt(n-1);
            int ops = 0;
            for(int i = 0;i<n;i++){
                if(s.charAt(i)!=c){
                    ops++;
                }
            }
            System.out.println(ops);
        }
        scanner.close();
    }
}
