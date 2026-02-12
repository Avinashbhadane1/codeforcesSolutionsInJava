import java.util.Arrays;
import java.util.Scanner;

public class cf1791G1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            long [] val = new long[n];
            long c = scanner.nextLong();
            for(int i = 0;i<n;i++){
                val[i] = scanner.nextLong()+i+1;
            }
            val = Arrays.stream(val).sorted().toArray();
            int index = 0;
            int tele = 0;
            while(c>=0 && index<n){
                c -= val[index];
                if(c<0) break;
                tele++;
                index++;
            }
            System.out.println(tele);
        }
        scanner.close();
    }
}
