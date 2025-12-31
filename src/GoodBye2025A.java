import java.util.Scanner;

public class GoodBye2025A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            boolean multipleTwo = false;
            int counter = 0;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)=='Y'){
                    counter++;
                }
                if (counter>=2){
                    multipleTwo = true;
                    break;
                }
            }
            if(multipleTwo){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
