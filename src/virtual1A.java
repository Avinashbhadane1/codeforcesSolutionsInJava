import java.util.Scanner;

public class virtual1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            long n = scanner.nextLong();
            if(n%4==0){
                System.out.println("Bob");
            }else{
                System.out.println("Alice");
            }
        }
        scanner.close();
    }
}
