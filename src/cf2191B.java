import java.util.Arrays;
import java.util.Scanner;

public class cf2191B {
    public static int findMex(int[] arr,int left,int right) {
        int n = arr.length;
        boolean[] present = new boolean[n + 1];

        for (int i = left;i<right;i++) {
            if (arr[i] >= 0 && arr[i] <= n) {
                present[arr[i]] = true;
            }
        }
        for (int i = 0; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return n + 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int [] a = new int[n];
            boolean possible = true;
            int min = n+1;
            for(int i = 0;i<n;i++){
                a[i] = scanner.nextInt();
                min = Math.min(min,a[i]);
            }
            a= Arrays.stream(a).sorted().toArray();
            if(min!=0){
                System.out.println("NO");
            }else{
                int index = 0;
                while(index<n-1){
                    int x = findMex(a,0,index);
                    int y = findMex(a,index+1,n-1);
                    if(x==y){
                        possible = false;
                        break;
                    }
                    index++;
                }
            }
            if(possible){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
