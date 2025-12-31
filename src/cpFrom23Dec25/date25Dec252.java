

import java.util.Scanner;

public class date25Dec252 {//1666D
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-->0){
            String s = sc.next();
            String t = sc.next();
            int m = s.length();
            int n  =t.length();
            int [] freqT = new int[26];
            for(int i = 0;i<n;i++){
                freqT[t.charAt(i)-'A']++;
            }
            StringBuilder finalString  = new StringBuilder();
            for(int i = m-1;i>=0;i--){
                if(freqT[s.charAt(i)-'A']>0){
                    freqT[s.charAt(i)- 'A']--;
                    finalString.append(s.charAt(i));
                }
            }
            finalString.reverse();
            if(finalString.toString().equals(t)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
