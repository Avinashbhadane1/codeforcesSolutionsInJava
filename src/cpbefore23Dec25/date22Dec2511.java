package cpbefore23Dec25;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class date22Dec2511 {
    //469A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> level = new HashSet<>();
        int p =sc.nextInt();
        for(int i=0;i<p;i++){
            level.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for(int i = 0;i<q;i++){
            level.add(sc.nextInt());
        }

        String output = level.size()==n ? "I become the guy.":"Oh, my keyboard!";
        System.out.println(output);
    }
}
