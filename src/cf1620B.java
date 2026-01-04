import java.util.Scanner;

public class cf1620B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            long w = scanner.nextLong();
            long h = scanner.nextLong();
            int k1 = scanner.nextInt();
            long [] xAxisPts = new long[k1];
            for(int i = 0;i<k1;i++){
                xAxisPts[i] = scanner.nextLong();
            }
            int k2 = scanner.nextInt();
            long [] hAxisPts = new long[k2];
            for(int i = 0;i<k2;i++){
                hAxisPts[i] = scanner.nextLong();
            }
            int k3 = scanner.nextInt();
            long [] yAxisPts = new long[k3];
            for(int i = 0;i<k3;i++){
                yAxisPts[i] = scanner.nextLong();
            }
            int k4 = scanner.nextInt();
            long [] wAxisPts = new long[k4];
            for(int i = 0;i<k4;i++){
                wAxisPts[i] = scanner.nextLong();
            }
            long xAxisBase = xAxisPts[k1-1] - xAxisPts[0];
            long hAxisBase = hAxisPts[k2-1] - hAxisPts[0];
            long yAxisBase = yAxisPts[k3-1] - yAxisPts[0];
            long wAxisBase = wAxisPts[k4-1] - wAxisPts[0];
            long base = Math.max(xAxisBase,hAxisBase);
            long baseOnY = Math.max(yAxisBase,wAxisBase);
            System.out.println(Math.max(base * h, baseOnY * w));

        }
        scanner.close();
    }
}
