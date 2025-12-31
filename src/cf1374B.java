import java.util.Scanner;

public class cf1374B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int twoExpo = 0;
            int threeExpo = 0;
            while(n%2==0){
                n /= 2;
                twoExpo++;
            }
            while (n%3==0){
                n /= 3;
                threeExpo++;
            }
            if(n!=1){
                System.out.println(-1);
                continue;
            }
            if(threeExpo>twoExpo) {
                System.out.println(Math.abs(2*threeExpo - twoExpo));
            }else if(twoExpo>threeExpo){
                System.out.println(-1);
            }else{
                System.out.println(twoExpo);
            }
        }
        scanner.close();
    }
}
