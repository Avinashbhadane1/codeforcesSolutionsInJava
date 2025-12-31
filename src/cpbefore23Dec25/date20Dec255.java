package cpbefore23Dec25;

import java.util.Scanner;

public class date20Dec255 {
    //1896A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- >0){
            int sum = 1;
            int len = sc.nextInt();
            sc.nextLine();
            String temp =sc.nextLine();
            String[] numString = temp.split(" ");
            for(int i = 1;i< numString.length;i++){
                if(Integer.parseInt(numString[0])>Integer.parseInt(numString[i])){
                    System.out.println("NO");
                    break;
                }else{
                    sum+=1;
                }
            }
            if(sum == numString.length){
                System.out.println("YES");
            }
        }
    }
}
