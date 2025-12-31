package cpbefore23Dec25;

import java.util.Scanner;

public class date21Dec252 {
    //1877A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            int sum = 0;
            int noOfTeams = sc.nextInt();
            sc.nextLine();
            String temp = sc.nextLine();
            String[] eff = temp.split(" ");
            for(String i:eff){
                int x = Integer.parseInt(i);
                sum += x;
            }
            System.out.println(-sum);
        }
    }
}
