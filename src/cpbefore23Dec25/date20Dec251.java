package cpbefore23Dec25;

import java.util.Scanner;

public class date20Dec251 {
    //1903A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n!=0){
            String temp1 = sc.nextLine();
            String[] nAndK = temp1.split(" ");
            int[] nAndKInt = new int[2];
            String temp2 = sc.nextLine();
            String[] numbers = temp2.split(" ");
            int [] nums = new int[numbers.length];
            int len = numbers.length;
            for(int i = 0;i< numbers.length;i++){
                nums[i] = Integer.parseInt(numbers[i]);

            }
            for(int i=0;i<2;i++){
                nAndKInt[i] = Integer.parseInt(nAndK[i]);
            }
            if(nAndKInt[1]> 1 ){
                System.out.println("YES");
            }else{
                boolean can;
                int a = 0;
                for(int i = 0;i<len-1;i++){
                    can = nums[i] <= nums[i + 1];
                    a += (can)? 1:0;
                }
                if(a==nums.length-1){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
            n--;
        }
    }
}
