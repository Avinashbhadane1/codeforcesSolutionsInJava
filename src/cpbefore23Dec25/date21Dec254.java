package cpbefore23Dec25;

import java.util.Scanner;

public class date21Dec254 {
    //1866A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int n = sc.nextInt();
        sc.nextLine();
        String temp = sc.nextLine();
        String[] num = temp.split(" ");
        for(String i: num){
            int x = Math.abs(Integer.parseInt(i));
            if(x<min){
                min = x;
            }
        }
        System.out.println(min);
    }
}
