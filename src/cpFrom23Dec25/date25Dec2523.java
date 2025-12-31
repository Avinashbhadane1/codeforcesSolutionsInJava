

import java.util.Scanner;

public class date25Dec2523 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            System.out.println(2*(n-1));
        }
        scanner.close();
    }
}
