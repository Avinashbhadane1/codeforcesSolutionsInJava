import java.util.Scanner;

public class cf71A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-->0){
            String s = scanner.nextLine();
            if(s.length()>10){
                int n = s.length();
                System.out.println(String.valueOf(s.charAt(0)) + (n-2) + s.charAt(n - 1));
            }else{
                System.out.println(s);
            }
        }
        scanner.close();
    }
}
