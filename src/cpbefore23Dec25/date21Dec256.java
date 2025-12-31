package cpbefore23Dec25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class date21Dec256 {
    //1859A
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }

            long mx = Arrays.stream(a).max().getAsLong();
            List<Long> b = new ArrayList<>();
            List<Long> c = new ArrayList<>();


            for (long value : a) {
                if (value != mx) {
                    b.add(value);
                } else {
                    c.add(value);
                }
            }


            if (b.size() == 0) {
                System.out.println(-1);
            } else {
                System.out.println(b.size() + " " + c.size());
                for (long value : b) {
                    System.out.print(value + " ");
                }
                System.out.println();
                for (long value : c) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}

