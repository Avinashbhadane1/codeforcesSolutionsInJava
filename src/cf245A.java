import java.util.Scanner;

public class cf245A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long aCount = 0;
        long bCount = 0;
        long numOfA = 0;
        long numOfB = 0;
        while (n-->0){
            int t = scanner.nextInt();
            int x  = scanner.nextInt();
            int y  = scanner.nextInt();
            if(t==1){
                numOfA++;
                aCount += x;
            }else{
                numOfB++;
                bCount += x;
            }
        }
        if (aCount>= (numOfA*10)/2){
            System.out.println("LIVE");
        }else{
            System.out.println("DEAD");
        }
        if (bCount>= (numOfB*10)/2){
            System.out.println("LIVE");
        }else{
            System.out.println("DEAD");
        }
        scanner.close();
    }
}
