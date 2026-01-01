import java.util.Scanner;

public class cf2171B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int [] arr = new int[n];
            boolean first = false;
            boolean last = false;
            for(int i = 0;i<n;i++){
                arr[i] = scanner.nextInt();
                if(arr[i]==-1 && i==0){
                    first = true;
                }else if(arr[i]==-1 && i==n-1){
                    last = true;
                }else if(arr[i]==-1){
                    arr[i]=0;
                }
            }
            if(first&& last){
                arr[0] = 0;
                arr[n-1] = 0;
            }else if(first ){
                arr[0]= arr[n-1];
            }else if(last){
                arr[n-1] = arr[0];
            }
            System.out.println(Math.abs(arr[n-1]-arr[0]));
            for(int i:arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
