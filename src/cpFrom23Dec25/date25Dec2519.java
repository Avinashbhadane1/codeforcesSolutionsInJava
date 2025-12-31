

import java.util.Scanner;

public class date25Dec2519 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-->0){
            long n = sc.nextLong();
            long s = sc.nextLong();
            int potted = 0;
            for(int i = 0;i<n;i++){
                long xDir = sc.nextLong();
                long yDir = sc.nextLong();
                long x = sc.nextLong();
                long y = sc.nextLong();
                if((xDir  == 1&& yDir==1)||(xDir == -1 && yDir == -1)){
                    if(y==x){
                        potted++;
                    }
                }else if((xDir==1 && yDir==-1) || (xDir == -1 && yDir == 1)){
                    if(y== (s-x)){
                        potted++;
                    }
                }
            }
            System.out.println(potted);
        }
        sc.close();
    }
}
