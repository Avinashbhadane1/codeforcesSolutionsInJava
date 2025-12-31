import java.util.Scanner;

public class cf1374A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();
            int ops = 0;
            int sum = 0;
            for(int i = 0;i<n;i++){
                if(s.charAt(i)=='('){
                    sum++;
                }else{
                    sum--;
                }
                if(sum<0){
                    ops++;
                    sum = 0;
                }
            }
            System.out.println(ops);
        }
        scanner.close();
    }
}
