

import java.util.Scanner;

public class date25Dec2518 {
    public static void main(String[] args) {//584A
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t= scanner.nextInt();
        if(t==10){
            if(n==1) {
                System.out.println(-1);
            }else {
                System.out.print(t);
                for (int i = 0; i < n - 2; i++) {
                    System.out.print(0);
                }
            }
        }else {
            System.out.print(t);
            for(int i = 0;i<n-1;i++){
                System.out.print(0);
            }
        }
        scanner.close();
    }
}
