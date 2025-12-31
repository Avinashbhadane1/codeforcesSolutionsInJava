package cpbefore23Dec25;

import java.util.Scanner;

public class date20Dec254 {
    //1899A
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- >0){
            int num = sc.nextInt();
            if(num%3 == 0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }

        }
    }
}
