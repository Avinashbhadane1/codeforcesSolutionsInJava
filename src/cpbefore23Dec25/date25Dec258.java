package cpbefore23Dec25;

import java.util.Scanner;

public class date25Dec258 {
    //1857A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int sum = 0;
            int lenOfArray = sc.nextInt();
            for(int i=0;i<lenOfArray;i++){
                sum+= sc.nextInt();
            }
            if(sum%2==0 ){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
