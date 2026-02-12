import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class cf195D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int non180 = 0;
        int i = 1;
        long [] val = new long[n];
        while(i<=n) {
            long k = scanner.nextLong();
            long b = scanner.nextLong();
            val[i-1] = k * i + b;
            i++;
        }
        ArrayList<Integer> sign = new ArrayList<>();
        for(int j = 0;j<n-1;j++){
            long d = val[j+1]-val[j];
            if(d>0){
                sign.add(1);
            }else if(d<0){
                sign.add(0);
            }
        }
        for(int j = 0;j<sign.size()-1;j++){
            if(!Objects.equals(sign.get(j), sign.get(j + 1))){
                non180++;
            }
        }
        System.out.println(non180);
        scanner.close();
    }
}
