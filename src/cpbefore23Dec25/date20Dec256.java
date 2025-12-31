package cpbefore23Dec25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class date20Dec256 {
    //1890A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            HashMap<Integer,Integer> frequencyMap = new HashMap<>();
            int len = sc.nextInt();
            sc.nextLine();
            String temp = sc.nextLine();
            String [] nums = temp.split(" ");
            for(String i : nums){
                int x = Integer.parseInt(i);
                frequencyMap.put(x, frequencyMap.getOrDefault(x,0)+1);
            }
            if(frequencyMap.size()>=3){
                System.out.println("NO");
            }else if(frequencyMap.size()==1){
                System.out.println("YES");
            }else{
                Iterator<Integer> it = frequencyMap.values().iterator();
                int f1 = it.next();
                int f2 = it.next();
                if(len%2==0 && f1==f2 ){
                    System.out.println("YES");
                }else if(len%2!=0 && Math.abs(f1-f2)==1){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
