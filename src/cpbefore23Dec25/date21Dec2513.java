package cpbefore23Dec25;

import java.util.Scanner;

public class date21Dec2513 {
    //1831A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0){
            int len = sc.nextInt();
            for(int i = 0;i<len;i++){
                System.out.print(len + 1 - sc.nextInt() + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
