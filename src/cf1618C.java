import java.util.Scanner;

public class cf1618C {
    public static long gcd(long a ,long b){
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            long [] a = new long[n];
            for(int i = 0;i<n;i++){
                a[i] = scanner.nextLong();
            }
            long odd = a[0];
            for(int i = 0;i<n;i+=2){
                odd = gcd(odd,a[i]);
            }
            long even = a[1];
            for(int i = 1;i<n;i+=2){
                even = gcd(even,a[i]);
            }
            System.out.println(even + " " + odd);
            if(odd==1||even==1){
                System.out.println(0);
            }else{
                if(even%odd==0||odd%even==0){
                    System.out.println(0);
                }else{
                    System.out.println(odd);
                }
            }
        }
        scanner.close();
    }
}
