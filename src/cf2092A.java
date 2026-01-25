import java.util.Scanner;

public class cf2092A {
    public static boolean odd(int n,String b, boolean leftSide){
        boolean isGood = true;
        if(leftSide){
            for(int i = n;i>=0;i = i-2){
                if (b.charAt(i) != '1') {
                    isGood = false;
                    break;
                }
            }
        }else{
            for (int i = n;i<=b.length();i = i+2){
                if(b.charAt(i)!='1'){
                    isGood = false;
                }
            }
        }
        return isGood;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            String a = scanner.next();
            String b = scanner.next();
            for(int i = 0;i<n;i++){
                if(a.charAt(i)=='1' && i!=0){

                }
            }
        }
        scanner.close();
    }
}
