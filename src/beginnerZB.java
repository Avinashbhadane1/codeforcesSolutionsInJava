import java.util.Scanner;

public class beginnerZB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int sub = 0;
            for(int i = 0;i<n;i++){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if(i==0) continue;
                sub += (2*m -( x + y));
            }
            sub *= 2;
            int perimeter = n*(4*m) - sub;
            System.out.println(perimeter);
        }
        scanner.close();
    }
}
