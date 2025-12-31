

import java.util.Scanner;

public class date25Dec2513 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int zeros = 0, ones = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') zeros++;
                else ones++;
            }

            if (zeros == ones) {
                System.out.println(0);
                continue;
            }


            for (char c : s.toCharArray()) {
                if (zeros < 0 || ones < 0) break;
                if (c == '1') zeros--;
                else ones--;

            }

            System.out.println(Math.max(zeros,ones));
        }
        sc.close();
    }
}
