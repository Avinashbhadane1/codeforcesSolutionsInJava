import java.util.Scanner;

public class date29Jan261 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int x;
            if(n%2==0){
                x = n / 2 + 1;
                for(int i = 0;i<n;i++){
                    System.out.print(x + " ");
                    if(i%2==0){
                        x -= i+1;
                    }else{
                        x += i+1;
                    }
                }
            }else{
                x = n / 2 +1;
                for(int i = 0;i<n;i++){
                    System.out.print(x + " ");
                    if(i%2==0){
                        x -= i+1;
                    }else{
                        x += i+1;
                    }
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
