import java.util.Scanner;

public class cf1373B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-->0){
            String s  = scanner.nextLine();
            int countOfZero = 0;
            int countOfOne = 0;
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    countOfZero++;
                }else{
                    countOfOne++;
                }
            }
            if(Math.min(countOfZero,countOfOne)%2==0){
                System.out.println("NET");
            }else{
                System.out.println("DA");
            }
        }
        scanner.close();
    }
}
