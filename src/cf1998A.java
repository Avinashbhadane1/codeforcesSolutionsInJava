import java.util.Scanner;

public class cf1998A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int k = scanner.nextInt();
            if(k%2==0){
                for(int i = 0;i<k/2;i++){
                    System.out.println((x+ i+1) + " " + y);
                    System.out.println( (x -(i+1) + " " + y));
                }
            }else {
                for(int i = 0;i<k/2;i++){
                    System.out.println((x+ i+1) + " " + y);
                    System.out.println( (x -(i+1) + " " + y));
                }
                System.out.println(x  +" " + y);
            }
        }
        scanner.close();
    }
}
