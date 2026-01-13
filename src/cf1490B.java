import java.util.Scanner;

public class cf1490B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int [] arr = new int[n];
            int []rem = new int[3];
            for(int i =0;i<n;i++){
                arr[i] = scanner.nextInt();
                rem[arr[i]%3]++;
            }
            int ops = 0;
            int eq = n/3;
            if(rem[0]==rem[1] && rem[1]==rem[2]){
                System.out.println(0);
            }else {
                while(rem[0]!=rem[1] ||rem[1]!=rem[2]){
                    if(rem[0]>eq){
                        rem[0]--;
                        rem[1]++;
                        ops++;
                    }
                    if(rem[1]>eq){
                        rem[1]--;
                        rem[2]++;
                        ops++;
                    }
                    if(rem[2]>eq){
                        rem[2]--;
                        rem[0]++;
                        ops++;
                    }
                }
                System.out.println(ops);

            }
        }
        scanner.close();
    }
}
