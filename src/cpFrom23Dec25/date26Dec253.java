

import java.util.Scanner;

public class date26Dec253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            int firstA = -1;
            int lastB = -1;
            for(int i = 0;i<n;i++){
                if(firstA==-1 && s.charAt(i)=='A') firstA = i;
                if(s.charAt(i)=='B'){
                    lastB = i;
                }
            }
            if(lastB==-1 || firstA==-1){
                System.out.println(0);
                continue;
            }
            if(lastB<firstA){
                System.out.println(0);
                continue;
            }
            System.out.println(lastB-firstA);
        }
        sc.close();
    }
}
