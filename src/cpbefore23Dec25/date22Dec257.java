package cpbefore23Dec25;

import java.util.HashMap;
import java.util.Scanner;

public class date22Dec257 {
    // 1883B
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            HashMap<Character, Integer> freq = new HashMap<>();

            for (char c : s.toCharArray()) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }

            int odd = 0;
            for (int count : freq.values()) {
                if (count % 2 != 0) odd++;
            }

            if (odd <= 1 || odd - 1 <= k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
