import java.util.Scanner;

public class cf2031B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            boolean possible = true;
            int n = scanner.nextInt();
            int [] p = new int[n];
            for(int i = 0;i<n;i++){
                p[i] = scanner.nextInt();
            }
            for(int i = 0;i<n;i++){
                int num = i+1;
                if(Math.abs(num - p[i])>1){
                    possible = false;
                    break;
                }
            }
            String output = possible?"YES":"NO";
            System.out.println(output);
        }
        scanner.close();
    }
}
