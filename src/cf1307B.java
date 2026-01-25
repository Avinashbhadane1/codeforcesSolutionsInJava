import java.util.Scanner;

public class cf1307B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            long x = scanner.nextLong();
            boolean hasX = false;
            long [] fav = new long[n];
            long max = Long.MIN_VALUE;
            for(int i = 0;i<n;i++){
                fav[i] = scanner.nextLong();
                max = Math.max(max,fav[i]);
                if(fav[i]==x){
                    hasX = true;
                }
            }
            if(hasX){
                System.out.println(1);
            }else{
                if(max>x){
                    System.out.println(2);
                }else{
                   if(x%max==0){
                       System.out.println(x/max);
                   }else{
                       System.out.println(x/max+1);
                   }
                }
            }
        }
        scanner.close();
    }
}
