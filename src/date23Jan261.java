import java.util.Scanner;

public class date23Jan261 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int h = scanner.nextInt();
            int l = scanner.nextInt();
            int []a = new int[n];
            int small = 0;
            int big = 0;
            for(int i = 0;i<n;i++){
                a[i] = scanner.nextInt();
                if(a[i]<=Math.min(l,h)){
                    small++;
                }
                if(a[i]<=Math.max(l,h)){
                    big++;
                }
            }
            if(big>small){
               if(big>2*small){
                   System.out.println(small);
               }else{
                   int x = big-small;
                   System.out.println(((small-x)/2) + x);
               }
            }else if(big==small){
                System.out.println(small/2);
            }
        }
        scanner.close();
    }
}
