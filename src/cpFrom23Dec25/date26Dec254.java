

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class date26Dec254 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            long q = scanner.nextLong();
            int reg = 0;
            List<Integer> probable = new ArrayList<>();
            for(int i = 0;i<n;i++){
                long x = scanner.nextLong();
                if (x<=q){
                    reg++;
                    if(i==n-1 && reg>0){
                        probable.add(reg);
                    }
                }else{
                    probable.add(reg);
                    reg = 0;
                }
            }
            long output = 0;
            for(int i: probable){
                if(i>=k){
                    long diff = i-k+1;
                    output += (diff*(diff+1))/2;

                }
            }
            System.out.println(output);
        }
        scanner.close();
    }
}
