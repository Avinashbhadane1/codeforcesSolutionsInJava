import java.util.Scanner;

public class cf2154C1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int [] a = new int[n];
            int []b = new int[n];
            int max = 0;
            int evens = 0;
            int odds = 0;
            for(int i = 0;i<n;i++){
                a[i] = scanner.nextInt();
                if(a[i]%2==0) {
                    evens++;
                }else{
                    odds++;
                }
                max = Math.max(0,a[i]);
            }
            for(int i = 0;i<n;i++){
                b[i] = scanner.nextInt();
            }
            if (max==1){
                System.out.println(2);
                continue;
            }
            if(evens>=2){
                System.out.println(0);
            }else if(evens==1){
                System.out.println(1);
            }else{

            }



        }
        scanner.close();
    }
}
