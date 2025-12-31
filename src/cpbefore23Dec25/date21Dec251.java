package cpbefore23Dec25;

import java.util.Scanner;

public class date21Dec251 {
    //1878A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-->0){
            boolean isPresent = false;
            String temp1 = sc.nextLine();
            String[] nAndKString = temp1.split(" ");
            String temp2 = sc.nextLine();
            String [] numString = temp2.split(" ");
            for(String i:numString){
                int x = Integer.parseInt(i)-Integer.parseInt(nAndKString[1]);
                if(!(Math.abs(x)>0)){
                    isPresent = true;
                    break;
                }
            }
            String output = isPresent ? "YES":"NO";
            System.out.println(output);
        }
    }
}
