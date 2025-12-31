package cpbefore23Dec25;

import java.util.Objects;
import java.util.Scanner;

public class date28Oct252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n>0){
            String text = sc.nextLine();
            String[] sides = text.split(" ");
            String same = sides[0];
            int count = 0;
            for (String side : sides) {
                if (Objects.equals(side, same)) {
                    count++;
                }
            }
            if(count==4){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
            n--;
        }
    }
}
