import java.util.Scanner;

public class cf1485A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long ans = Long.MAX_VALUE;
            for(int add = 0;add<32;add++){
                long operations = add;
                long newB = b+add;
                long copyA = a;
                if(newB==1) continue;
                while(copyA>0){
                    copyA /= newB;
                    operations++;
                }
                ans = Math.min(ans,operations);
            }
            System.out.println(ans);
        }
        scanner.close();
    }
}
