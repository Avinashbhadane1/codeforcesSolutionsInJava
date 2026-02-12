import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class cf1201B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long [] a = new long[n];
        long [] prefixSum = new long[n];
        for(int i =0;i<n;i++){
            a[i] = scanner.nextLong();
        }
        a = Arrays.stream(a).sorted().toArray();
        prefixSum[0] = a[0];
        for(int i = 1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + a[i];
        }
        if(prefixSum[n-1]%2!=0){
            System.out.println("NO");
        }else{
            int pointer = 0;
            int misplaced = n-1;
            if(prefixSum[n-1]<a[n-1]) {
                System.out.println("NO");
            }else {
                while (misplaced >= 0 && pointer<n) {
                    if (prefixSum[pointer] > a[misplaced]) {
                        a[misplaced] -= prefixSum[pointer - 1];
                        pointer--;
                        misplaced--;
                    } else if (prefixSum[pointer] == a[misplaced]) {
                        a[misplaced]=0;
                        misplaced--;
                    }
                    pointer++;
                }
            }
        }
        scanner.close();
    }
}
