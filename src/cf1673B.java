import java.util.Scanner;

public class cf1673B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            String s = scanner.next();
            int [] freq = new int[26];
            for(char c:s.toCharArray()){
                freq[c - 'a']++;
            }
            int totalDiffChars = 0;
            for(int i = 0;i<26;i++){
                if(freq[i]!=0){
                    totalDiffChars++;
                }
            }
            if(totalDiffChars>s.length()-2||totalDiffChars==1){
                System.out.println("YES");
                continue;
            }

        }
        scanner.close();
    }
}
