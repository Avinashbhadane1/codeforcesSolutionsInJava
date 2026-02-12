import java.util.Scanner;

public class cf1469B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int [] r = new int[n];
            for(int i = 0;i<n;i++){
                r[i] = scanner.nextInt();
            }
            int m = scanner.nextInt();
            int [] b = new int[m];
            for(int i = 0;i<m;i++){
                b[i] = scanner.nextInt();
            }
            int rPointer = 0;
            int bPointer = 0;
            int maxSum = 0;
            int sum = 0;
            while(rPointer < n && bPointer<m){
                int x = r[rPointer];
                int y = b[bPointer];
                if((x>=0 && y>=0) || (x<0 && y<0)){
                    if(x>y){
                        sum += x;
                        maxSum = Math.max(maxSum,sum);
                        rPointer++;
                    }else if(x==y){
                        if(r.length>=b.length){
                            sum+= x;
                            maxSum = Math.max(maxSum,sum);
                            rPointer++;
                        }else{
                            sum += y;
                            maxSum = Math.max(maxSum,sum);
                            bPointer++;
                        }
                    }else{
                        sum += y;
                        maxSum = Math.max(maxSum,sum);
                        bPointer++;
                    }
                }else if(x>=0){
                    sum += x;
                    maxSum = Math.max(maxSum,sum);
                    rPointer++;
                }else {
                    sum += y;
                    maxSum = Math.max(maxSum,sum);
                    bPointer++;
                }
                System.out.println("sum: " + sum);
                System.out.println(maxSum);
            }
            for(int i = rPointer;i<n;i++){
                sum += r[i];
                maxSum = Math.max(maxSum,sum);
                System.out.println("sum in r: " + sum);
                System.out.println("max in r: " + maxSum);
            }
            for(int i = bPointer;i<m;i++){
                sum += b[i];
                maxSum = Math.max(maxSum,sum);
                System.out.println("sum in b: " + sum);
                System.out.println("max in b: " + maxSum);
            }
            System.out.println(maxSum);
        }
        scanner.close();
    }
}
