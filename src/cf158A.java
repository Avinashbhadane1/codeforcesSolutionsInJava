import java.util.Scanner;

public class cf158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int min = a[k-1];
        int advancing = 0;
        for(int i:a){
            if(i>0) {
                if (i < min) {
                    break;
                } else {
                    advancing++;
                }
            }
        }
        System.out.println(advancing);
    }
}
