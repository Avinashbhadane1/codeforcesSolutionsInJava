import java.util.Scanner;

public class cf617A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            long x = scanner.nextLong();
            if(x>5){
                System.out.println((x/5) +1);
            }else {
                System.out.println(1);
            }

        scanner.close();
    }
}
