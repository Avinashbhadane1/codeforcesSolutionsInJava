import java.util.Scanner;

public class threeIndices1380A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int pi = -1;
            int pj = -1;
            int pk = -1;
            boolean yes = false;

            for(int i = 1;i<n-1;i++){
                if(a[i-1]<a[i] && a[i]>a[i+1]){
                    yes = true;
                    pi = i-1;
                    pj = i;
                    pk = i+1;
                    break;
                }
            }
            if (yes){
                System.out.println("YES");
                System.out.println((pi +1) + " " + (pj +1) + " " + (pk+1));
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
