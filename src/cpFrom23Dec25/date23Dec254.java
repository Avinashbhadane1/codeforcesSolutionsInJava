

import java.util.Scanner;

public class date23Dec254 {
    //1855B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long n = sc.nextLong();
            int length = 0;
            for(int i = 1;i<=n;i++){
                if(n%i==0){
                    length++;
                }else{
                   break;
                }
            }
            System.out.println(length>0? length:1);
        }
        sc.close();
    }
}
