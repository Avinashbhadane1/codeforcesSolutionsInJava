

import java.util.Scanner;

public class date25Dec2524 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            if(n>=33 && n%33==0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
