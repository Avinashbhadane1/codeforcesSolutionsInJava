import java.util.Scanner;

public class cf281A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String capitalized = s.toUpperCase();
        System.out.print(capitalized.charAt(0));
        for(int i = 1;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
        System.out.println();
        scanner.close();
    }
}
