import java.util.Arrays;
import java.util.Scanner;

public class cf1725B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            long d = scanner.nextLong();
            long[] power = new long[(int)n];
            for(int i = 0;i<n;i++){
                power[i] = scanner.nextLong();
            }
            long left = -1;
            int right = n-1;
            long teamSize = 1;
            long teams = 0;
            power = Arrays.stream(power).sorted().toArray();
            while (left<right){
                if(power[right]*teamSize<=d && left<right ){
                    left++;
                    teamSize++;
                }else {
                    right--;
                    teams++;
                    teamSize = 1;
                }
            }
            System.out.println(teams);

        scanner.close();
    }
}
