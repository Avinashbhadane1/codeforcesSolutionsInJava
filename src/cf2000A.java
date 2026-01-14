import java.util.Scanner;

public class cf2000A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-->0){
            String string  = scanner.nextLine();
            int n = string.indexOf("10");
            if(n!=-1 && n+2<string.length()){
                int c = Integer.parseInt(String.valueOf(string.charAt(n+2)));
                if(c==0){
                    System.out.println("NO");
                }else if(c==1){
                    if(n+3<string.length()){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }else{
                    System.out.println("YES");
                }
            }else{
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
