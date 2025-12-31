import java.util.*;

public class beginnerW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();

            ArrayList<Integer> rows = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String s = sc.nextLine();
                int cnt = 0;
                for (char c : s.toCharArray()) {
                    if (c == '1') cnt++;
                }
                if (cnt > 0) rows.add(cnt);
            }

            boolean square = true;
            for (int i = 1; i < rows.size(); i++) {
                if (!rows.get(i).equals(rows.getFirst())) {
                    square = false;
                    break;
                }
            }

            System.out.println(square ? "SQUARE" : "TRIANGLE");
        }
        sc.close();
    }
}
