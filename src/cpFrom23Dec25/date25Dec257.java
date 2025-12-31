

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class date25Dec257 {
    public static int minOps(String n,String p){
        int ops = 0;
        int checker = p.length()-1;
        for(int i = n.length()-1;i>=0;i--){
            if(n.charAt(i)==p.charAt(checker)){
                checker--;
                if(checker<0){
                    break;
                }
            }else {
                ops++;
            }
        }
        if(checker>=0){
            ops = Integer.MAX_VALUE;
        }
        return ops;
    }
    public static void main(String[] args) {//1593B
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            String string = sc.next();
            ArrayList<String> possible = new ArrayList<>(Arrays.asList("00","25","50","75"));
            int ans = Integer.MAX_VALUE;
            for(String i : possible){
                ans = Math.min(ans,minOps(string,i));
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
