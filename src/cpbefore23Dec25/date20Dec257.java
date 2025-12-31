package cpbefore23Dec25;

import java.util.Scanner;

public class date20Dec257 {
    //1881A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            int count = 0;
            String temp = sc.nextLine();
            String [] numString = temp.split(" ");
            String x = sc.nextLine();
            String y = sc.nextLine();
            if(x.contains(y)){
                System.out.println(0);
            }else {
                for (int i = 0; i < 7; i++) {
                    x += x;
                    count++;
                    if(x.contains(y)){
                        break;
                    }
                }
                if(count>=6){
                    System.out.println(-1);
                }else {
                    System.out.println(count);
                }
            }
        }
    }
}
