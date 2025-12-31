import java.util.Scanner;

public class beginnerZ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toCharArray();

        int n = s.length;
        int i = 0;

        while (i < n && s[i] == 'a') i++;

        if (i == n) {
            s[n-1] = 'z';
            System.out.println(new String(s));
            return;
        }

        while (i < n && s[i] != 'a') {
            s[i] = (char)((s[i] - 'a' + 25) % 26 + 'a');
            i++;
        }

        System.out.println(new String(s));
        sc.close();
    }
}
