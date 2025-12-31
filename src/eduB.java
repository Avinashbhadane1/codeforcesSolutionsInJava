import java.util.Scanner;

public class eduB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            int maxLayers = 0;
            for (int n = 1; n < 40; n++) {
                long sOdd = 0;
                long sEven = 0;

                for (int i = 0; i < n; i++) {
                    long layerSize = (long) Math.pow(2, i);
                    if (i % 2 == 0) {
                        sOdd += layerSize;
                    } else {
                        sEven += layerSize;
                    }
                }
                if ((sOdd <= a && sEven <= b) || (sOdd <= b && sEven <= a)) {
                    maxLayers = n;
                } else {

                    break;
                }
            }
            System.out.println(maxLayers);
        }
        sc.close();
    }
}
