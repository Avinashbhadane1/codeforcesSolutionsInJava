

import java.util.HashMap;
import java.util.Scanner;

public class date25Dec253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();

            HashMap<Integer,Integer> freq  =new HashMap<>();
            int maxFreq = 0;
            for(int i = 0;i<n;i++){
                int x  =sc.nextInt();
                freq.put(x,freq.getOrDefault(x,0)+1);
            }
            for(int i :freq.values()){
                if(maxFreq<i){
                    maxFreq = i;
                }
            }
            int ops = 0;
            if(maxFreq==n){
                System.out.println(0);
            }else{
                int k = maxFreq*2;
                ops++;
                while(k<n){
                    k *= 2;
                    ops++;
                }
                ops += n-maxFreq;
                System.out.println(ops);
            }
        }
        sc.close();
    }
}
