import java.util.Scanner;

public class date25Jan26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            int x = scanner.nextInt();
            int sum = 0;
            for(int i = 0;i<n;i++){
                sum += scanner.nextInt();
            }
            if(sum>s){
                System.out.println("NO");
                continue;
            }
            if((s-sum)%x==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
        scanner.close();
    }
}
