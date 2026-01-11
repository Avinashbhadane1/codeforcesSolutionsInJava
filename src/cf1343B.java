import java.util.Scanner;

public class cf1343B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            if((n/2)%2!=0){ System.out.println("NO");continue;}
            System.out.println("YES");
            int evenCount = 0;
            int sum  =0;
            for(int i =0;i<n/2;i++){
                evenCount += 2;
                sum += evenCount;
                System.out.print(evenCount + " ");
            }
            int oddCount = 1;
            for(int i = 0;i<n/2;i++){
                if(i== (n/2)-1 && oddCount<=sum) {
                    System.out.println(sum);
                }else{
                    System.out.print(oddCount + " ");
                    sum -= oddCount;
                    oddCount += 2;
                }
            }
        }
        scanner.close();
    }
}
