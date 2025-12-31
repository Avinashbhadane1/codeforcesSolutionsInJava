

import java.util.Arrays;
import java.util.Scanner;

public class date25Dec2517 {//339A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        String[] numString = temp.split("\\+");
        int[] num = new int[numString.length];
        for(int i = 0;i<numString.length;i++){
            num[i] = Integer.parseInt(numString[i]);
        }
        Arrays.sort(num);
        for(int i =0;i<num.length;i++){
            if(i!= num.length-1) {
                System.out.print(num[i] + "+");
            }else{
                System.out.print(num[i]);
            }
        }

    }
}
