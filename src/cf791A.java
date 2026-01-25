import java.util.Scanner;

public class cf791A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ops = 1;
        while(true){
            a *= 3;
            b *= 2;
            if(a>b){
                break;
            }
            ops++;
        }
        System.out.println(ops);
        scanner.close();
    }
}
