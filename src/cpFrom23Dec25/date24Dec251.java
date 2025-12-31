

import java.util.Scanner;
//1837B
public class date24Dec251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int longestSub = 1;
            int currentSub = 1;
            for(int i = 1;i<n;i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    currentSub++;
                    longestSub = Math.max(longestSub,currentSub);
                }else{
                    longestSub = Math.max(longestSub,currentSub);
                    currentSub = 1;
                }
            }

            longestSub = Math.max(longestSub,currentSub);
            System.out.println(longestSub+1);
        }
        sc.close();
    }
}
