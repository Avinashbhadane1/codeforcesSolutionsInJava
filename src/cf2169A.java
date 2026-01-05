import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class cf2169A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long a = Long.parseLong(st.nextToken());
            st = new StringTokenizer(br.readLine());

            ArrayList<Long> left = new ArrayList<>();
            ArrayList<Long> right = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                long v = Long.parseLong(st.nextToken());
                if (v < a) {
                    left.add(v);
                } else if (v > a) {
                    right.add(v);
                }
            }

            if (left.isEmpty() && right.isEmpty()) {
                sb.append(0).append("\n");
                continue;
            }

            int leftSize = left.size();
            int rightSize = right.size();

            if (leftSize >= rightSize) {
                Collections.sort(left);
                sb.append(left.get(leftSize - 1)).append("\n");
            } else {
                Collections.sort(right);
                sb.append(right.get(0)).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
