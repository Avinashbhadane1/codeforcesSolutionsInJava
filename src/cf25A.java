import java.util.ArrayList;
import java.util.Scanner;

public class cf25A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<int []> evens = new ArrayList<>();
        ArrayList<int []> odds = new ArrayList<>();
        for(int i = 0;i<n;i++){
            int x = scanner.nextInt();
            if(x%2==0){
               evens.add(new int[]{x, i});
            }else{
                odds.add(new int[]{x,i});
            }
        }
        if(evens.size()> odds.size()){
            System.out.println(odds.getFirst()[1] + 1);
        }else{
            System.out.println(evens.getFirst()[1] + 1);
        }
        scanner.close();
    }
}
