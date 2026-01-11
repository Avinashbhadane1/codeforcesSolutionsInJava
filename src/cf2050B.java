import java.util.Scanner;

public class cf2050B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            StringBuilder builder = new StringBuilder();
            int n = scanner.nextInt();
            int [] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = scanner.nextInt();
            }
            int [] alpha = new int[26];
            int current = 65;
            for (int i = 0;i<n;i++){
                if(a[i]==0){
                    builder.append((char) current);
                    alpha[current-65]++;
                    current++;
                }else{
                    for(int j = 0;j<26;j++){
                        if(alpha[j]==a[i]){
                            builder.append((char)(j+65));
                            alpha[j]++;
                            break;
                        }
                    }
                }
            }
            System.out.println(builder.toString().toLowerCase());

        }
        scanner.close();
    }
}
