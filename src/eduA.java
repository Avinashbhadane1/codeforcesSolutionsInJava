import java.util.Scanner;

public class eduA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-->0){
            int n = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();
            if(s.contains("2026")){
                System.out.println(0);
                continue;
            }
            if(!s.contains("2025")){
                System.out.println(0);
                continue;
            }
            if(s.contains("2025") && !s.contains("2026")){
                System.out.println(1);
            }
        }
        scanner.close();
    }
}
