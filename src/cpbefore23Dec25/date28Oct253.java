package cpbefore23Dec25;

import java.util.Scanner;

public class date28Oct253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<n;i++){
            String get = sc.nextLine();
            String[] dataInString = get.split(" ");
            int [] data = new int[dataInString.length];
            for(int j=0;j<dataInString.length;j++){
                data[j] = Integer.parseInt(dataInString[j]);
            }
            int [][] board = new int[data[0]][data[0]];

        }
    }
}
