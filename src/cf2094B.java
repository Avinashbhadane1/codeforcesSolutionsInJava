import java.util.Scanner;

public class cf2094B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int left = 0;
            int right= 0;
            boolean rightComplete = false;
            if(n==m){
                System.out.println(l + " " + r);
            }else {
                while(m>0){
                    if(!rightComplete){
                        right++;
                        m--;
                        if(right==r){
                            rightComplete = true;
                        }
                    }else{
                        left--;
                        m--;
                    }
                }
                System.out.println(left + " " + right);
            }
        }
        scanner.close();
    }
}
