package cpbefore23Dec25;

import java.util.Scanner;
//1788A
public class date21Dec2510 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int totalTwos = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 2) totalTwos++;
            }

            if (totalTwos % 2 != 0) {
                System.out.println(-1);
            } else if (totalTwos == 0) {
                System.out.println(1);   // ⭐ key fix
            } else {
                int need = totalTwos / 2;
                int count = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == 2) {
                        count++;
                        if (count == need) {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                }
            }
        }
        sc.close();
    }
}
