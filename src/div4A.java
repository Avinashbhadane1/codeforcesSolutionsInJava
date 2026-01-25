import java.util.Scanner;

public class div4A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            for(int i = 1;i<=n;i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
