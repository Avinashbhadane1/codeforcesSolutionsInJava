

import java.util.ArrayList;
import java.util.Scanner;

public class date25Dec2520 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> names = new ArrayList<>();
        for(int i = 0;i<n;i++){
            String s = scanner.nextLine();
            if (names.contains(s)) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            names.add(s);
        }
        scanner.close();
    }
}
