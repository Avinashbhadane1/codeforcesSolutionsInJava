package cpbefore23Dec25;

import java.util.Arrays;
import java.util.Scanner;

public class date7Nov251 {
    public static boolean good(int[] S, int[] T, int k) {
        int n = S.length;

        int[] A = new int[n];
        int[] B = new int[n];

        for(int i = 0; i < n; i++) {
            int r1 = S[i] % k;
            if (r1 > k - r1) r1 = k - r1;
            A[i] = r1;

            int r2 = T[i] % k;
            if (r2 > k - r2) r2 = k - r2;
            B[i] = r2;
        }

        Arrays.sort(A);
        Arrays.sort(B);

        return Arrays.equals(A, B);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTests = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<noOfTests;i++){
            String first = sc.nextLine();
            String[] nAndK = first.split(" ");
            int lengthOfS = Integer.parseInt(nAndK[0]);
            int k = Integer.parseInt(nAndK[1]);
            String sec = sc.nextLine();
            String[] secTemp = sec.split(" ");
            int [] setS = new int[lengthOfS];
            for(int j = 0;j<lengthOfS;j++){
                setS[j] = Integer.parseInt(secTemp[j]);
            }
            String third = sc.nextLine();
            String[] thTemp = third.split(" ");
            int [] setT = new int[thTemp.length];
            for(int j = 0;j< thTemp.length;j++){
                setT[j] = Integer.parseInt(thTemp[j]);
            }
            boolean decide = good(setS,setT,k);
            String result = (decide)? "YES":"NO";
            System.out.println(result);
        }
    }
}
