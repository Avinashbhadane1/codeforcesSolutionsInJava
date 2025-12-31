

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class date25Dec2521 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        arr = Arrays.stream(arr)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        int total = Arrays.stream(arr).sum();
        int taken = 0;int sum = 0;
        for(int i = 0;i<n;i++){
            sum += arr[i];
            taken++;
            if(sum>total/2){
                break;
            }
        }
        System.out.println(taken);

    }
}
