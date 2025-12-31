

import java.util.Scanner;

public class date25Dec256 {
//1606A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String s = sc.nextLine();
            int ab = 0;
            int ba = 0;
            for(int i = 0;i<s.length()-1;i++){
                if(s.charAt(i)=='a' && s.charAt(i+1)=='b'){
                    ab++;
                }
                if(s.charAt(i)=='b' && s.charAt(i+1)=='a'){
                    ba++;
                }
            }
            StringBuilder fin = new StringBuilder();
            if(ab>ba){
                fin.append('b');
                for(int i = 1;i<s.length();i++){
                    fin.append(s.charAt(i));
                }
                System.out.println(fin.toString());
            }else if(ba>ab){
                for(int i = 0;i<s.length()-1;i++){
                    fin.append(s.charAt(i));
                }
                fin.append('b');
                System.out.println(fin.toString());
            }else{
                System.out.println(s);
            }
        }
        sc.close();
    }
}
