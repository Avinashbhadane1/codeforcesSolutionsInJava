package cpbefore23Dec25;

import java.util.Scanner;

public class date22Dec2510 {
    //1713A
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int moves = 0;
            int maxPosX = 0;
            int minNegX = 0;
            int maxPosY = 0;
            int minNegY = 0;
            for (int i = 0; i < 2 * n; i++) {
                if (i % 2 == 0) {
                    int x = sc.nextInt();
                    if (x >= 0) {
                        if (maxPosX < x) {
                            maxPosX = x;
                        }
                    } else {
                        if (minNegX > x) {
                            minNegX = x;
                        }
                    }
                } else {
                    int y = sc.nextInt();
                    if (y >= 0) {
                        if (maxPosY < y) {
                            maxPosY = y;
                        }
                    } else {
                        if (minNegY > y) {
                            minNegY = y;
                        }
                    }
                }

            }
            System.out.println(2*(maxPosY-minNegY + maxPosX-minNegX));
        }
        sc.close();
    }
}
