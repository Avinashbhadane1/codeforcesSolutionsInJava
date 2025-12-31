

import java.util.*;

public class date25Dec2516 {
    public static void main(String[] args) {
        //152A
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        HashSet<Integer> suc = new HashSet<>();
        String[] sheet = new String[n];
        char[] high = new char[m];
        for(int i = 0;i<n;i++){
            sheet[i] = sc.nextLine();
        }
        for(int i = 0;i<m;i++){
            int tempMax = 0;
            char max = '0';
            for(int j = 0;j<n;j++){
                int x = Integer.parseInt(String.valueOf(sheet[j].charAt(i)));
                if(x>tempMax){
                    tempMax = x;
                    max = sheet[j].charAt(i);
                }
            }
            high[i] = max;
        }
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(sheet[j].charAt(i)==high[i]){
                    suc.add(j);
                }
            }
        }
        System.out.println(suc.size());
    }
}
