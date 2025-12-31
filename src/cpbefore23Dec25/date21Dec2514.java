package cpbefore23Dec25;

import java.util.Scanner;

public class date21Dec2514 {
    //1829B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int maxLen = 0;
            int regressor = 0;
            int n = sc.nextInt();
            for (int i = 0;i<n;i++){
                int x = sc.nextInt();
                if(x==0){
                    regressor++;
                    if(maxLen<regressor){
                        maxLen = regressor;
                    }
                }else{
                    regressor=0;
                }
            }
            System.out.println(maxLen);
        }
        sc.close();
    }
}
