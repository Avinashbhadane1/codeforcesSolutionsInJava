import java.util.Scanner;

public class watermelonA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n%2==0 && n>2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
