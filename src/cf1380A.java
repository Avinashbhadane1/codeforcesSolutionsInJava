import java.util.Scanner;

public class cf1380A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            boolean can = false;
            int n = scanner.nextInt();
            int [] array = new int[n];
            for (int i = 0;i<n;i++){
                array[i] = scanner.nextInt();
            }
            for(int i = 1;i<n-1;i++){
                if(array[i-1]<array[i] && array[i+1]<array[i]){
                    System.out.println("YES");
                    System.out.println((i) + " " + (i+1) + " " + (i+2));
                    can = true;
                    break;
                }
            }
            if(!can){
                System.out.println("NO");
            }

        }
        scanner.close();
    }
}
