package cpbefore23Dec25;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class date30Oct251 {
    public static boolean arrangeable(String[] names,int length){
        boolean arrangeable = false;
        int [][] indexer = new int[2][26];
        names[0] = names[0].toLowerCase();
        names[1] = names[1].toLowerCase();
        Map<String,Integer> values = new HashMap<>();
        for(int i = 97;i<=122;i++){
            char c = (char)(i);
            values.put(String.valueOf(c),(i-96));
        }
        for(int i = 97;i<=122;i++){
            char c = (char)(i);
            for(int j = 0;j<length;j++){
                if(names[0].charAt(j)==c){
                    indexer[0][values.get(String.valueOf(c))-1] += 1;
                }
            }
        }
        for(int i = 97;i<=122;i++){
            char c = (char)(i);
            for(int j = 0;j<length;j++){
                if(names[1].charAt(j)==c){
                    indexer[1][values.get(String.valueOf(c))-1] += 1;
                }
            }
        }
        int[] finalResultNum = new int[2];
        for(int i = 0;i<names.length;i++){
            for(int j = 0;j<length;j++){
                finalResultNum[i] += values.get(String.valueOf(names[i].charAt(j)));
            }
        }
        if(finalResultNum[0]==finalResultNum[1]){
            if(Arrays.equals(indexer[0],indexer[1])){
                arrangeable = true;
            }
        }
        return arrangeable;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i =0;i<n;i++){
            int length = sc.nextInt();
            sc.nextLine();
            String temp = sc.nextLine();
            String[] bothNames = temp.split(" ");
            String print = (arrangeable(bothNames,length)) ? "yes":"no";
            System.out.println(print);
        }
    }
}
