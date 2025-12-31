package cpbefore23Dec25;

import java.util.HashMap;
import java.util.Scanner;

public class date22Dec2512 {
    //236A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string  = sc.nextLine();
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c: string.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0) + 1);
        }
        String output = freq.size()%2==0 ? "CHAT WITH HER!":"IGNORE HIM!";
        System.out.println(output);
    }
}
