import java.util.ArrayList;
import java.util.Scanner;

public class cf2114B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            scanner.nextLine();
            int palindromes = 0;
            String s = scanner.nextLine();
            for(int i = 0;i<n;i++){
                if(s.charAt(i)!=s.charAt(n-i-1)){
                    palindromes++;
                }
            }
            if(k==palindromes){
                System.out.println(0);
            }else if(k>palindromes){

            }
        }
        scanner.close();
    }
}
