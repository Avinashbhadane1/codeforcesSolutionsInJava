import java.util.Scanner;

public class cf1155A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        boolean less = true;
        int left = -1;
        int right = -1;
        for(int i =0;i<n-1;i++){
            int x = (int) s.charAt(i);
            int y = (int) s.charAt(i+1);
            if(x>y){
                less = false;
                left = i+1;
                right = i+2;
                break;
            }
        }
        if(less){
            System.out.println("NO");
        }else {
            System.out.println("YES");
            System.out.println(left + " "+ right);
        }
        scanner.close();
    }
}
