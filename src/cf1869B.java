import java.util.Scanner;

public class cf1869B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            long [][] cities = new long[n][2];
            for(int i = 0;i<n;i++){
                cities[i][0] = sc.nextLong();
                cities[i][1] = sc.nextLong();
            }
            if(a<=k && b<=k){
                System.out.println(0);
            }else if(a<=k){
                long minCost = Long.MAX_VALUE;
                for(int i= 0;i<k;i++){
                    long cost = Math.abs(cities[b-1][0] - cities[i][0]);
                    cost += Math.abs(cities[b-1][1] - cities[i][1]);
                    minCost = Math.min(minCost,cost);
                }
                System.out.println(minCost);
            }else if(b<=k){
                long minCost = Long.MAX_VALUE;
                for(int i= 0;i<k;i++){
                    long cost = Math.abs(cities[a-1][0] - cities[i][0]);
                    cost += Math.abs(cities[a-1][1] - cities[i][1]);
                    minCost = Math.min(minCost,cost);
                }
                System.out.println(minCost);
            }else{
                long minCost = Math.abs(cities[a-1][0]-cities[b-1][0]) + Math.abs(cities[a-1][1] - cities[b-1][1]);
                long minCost1 = Long.MAX_VALUE;
                for(int i= 0;i<k;i++){
                    long cost = Math.abs(cities[b-1][0] - cities[i][0]);
                    cost += Math.abs(cities[b-1][1] - cities[i][1]);
                    minCost1 = Math.min(minCost1,cost);
                }
                long minCost2 = Long.MAX_VALUE;
                for(int i= 0;i<k;i++){
                    long cost = Math.abs(cities[a-1][0] - cities[i][0]);
                    cost += Math.abs(cities[a-1][1] - cities[i][1]);
                    minCost2 = Math.min(minCost2,cost);
                }
                if(k!=0){
                    minCost = Math.min(minCost,minCost1+minCost2);
                }
                System.out.println(minCost);
            }
        }
        sc.close();
    }
}
