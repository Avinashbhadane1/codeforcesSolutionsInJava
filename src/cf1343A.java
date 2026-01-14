import java.util.Scanner;

public class cf1343A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            long n = scanner.nextLong();
            long x  = 1;
            for(int i = 2;i<33;i++){
                long y = (long)Math.pow(2,i)-1;
                if(n%y==0){
                    x = n/y;
                    break;
                }
            }
            System.out.println(x);
        }
        scanner.close();
    }
}
