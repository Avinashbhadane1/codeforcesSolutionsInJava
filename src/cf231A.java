import java.util.Scanner;

public class cf231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long pro = sc.nextLong();
        long prob = 0;
        for(int i = 0;i<pro;i++){
            int temp = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            temp += a+b+c;
            if(temp>=2){
                prob++;
            }
        }
        System.out.println(prob);
    }
}
