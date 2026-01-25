import java.util.Scanner;

public class cf279B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long t = scanner.nextLong();

        int[] books = new int[n];
        for (int i = 0; i < n; i++) {
            books[i] = scanner.nextInt();
        }

        int l = 0;
        long sum = 0;
        int maxBooks = 0;

        for (int r = 0; r < n; r++) {
            sum += books[r];

            while (sum > t) {
                sum -= books[l];
                l++;
            }

            maxBooks = Math.max(maxBooks, r - l + 1);
        }

        System.out.println(maxBooks);
        scanner.close();
    }
}
