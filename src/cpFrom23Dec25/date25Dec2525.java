

import java.util.Scanner;

public class date25Dec2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(Math.abs(a-b)%2==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
