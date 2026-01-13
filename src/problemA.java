import java.util.Scanner;

public class problemA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            if(n==2){
                System.out.println(2);
            }else if(n==3){
                System.out.println(3);
            }else {
                System.out.println(n%2);
            }

        }
        scanner.close();
    }
}
