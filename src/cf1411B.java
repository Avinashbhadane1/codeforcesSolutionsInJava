import java.util.Scanner;

public class cf1411B {
    public static boolean fair(long n){
        String str = String.valueOf(n);
        boolean ret = true;
        for(int i = 0;i<str.length();i++){
            int x = Integer.parseInt(String.valueOf(str.charAt(i)));
            if(x!=0){
                if(n%x!=0){
                    ret = false;
                    break;
                }
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            long n = scanner.nextLong();
            if(fair(n)){
                System.out.println(n);
            }else{
                while(!fair(n)){
                    n++;
                }
                System.out.println(n);
            }
        }
        scanner.close();
    }
}
