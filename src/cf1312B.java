import java.util.Arrays;
import java.util.Scanner;

public class cf1312B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int [] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = scanner.nextInt();
            }
            arr = Arrays.stream(arr).sorted().toArray();
//            int left = 0;
//            int right = n-1;
//            while(left<right){
//                System.out.print(arr[right] + " " + arr[left] + " ");
//                left++;
//                right--;
//            }
//            if (n % 2 != 0) {
//                System.out.print(arr[(left + right) / 2]);
//            }
//            System.out.println();
            for(int i = n-1;i>=0;i--){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
