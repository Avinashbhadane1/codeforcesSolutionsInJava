import java.io.*;

public class beginnerZEN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String row1 = br.readLine();
            String row2 = br.readLine();

            int[] dp = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                char c1 = row1.charAt(i - 1);
                char c2 = row2.charAt(i - 1);

                int singleMex = getMex(c1, c2);
                dp[i] = dp[i - 1] + singleMex;

                if (i > 1) {
                    char p1 = row1.charAt(i - 2);
                    char p2 = row2.charAt(i - 2);

                    int doubleMex = getMexBlock(c1, c2, p1, p2);

                    dp[i] = Math.max(dp[i], dp[i - 2] + doubleMex);
                }
            }

            output.append(dp[n]).append("\n");
        }

        System.out.print(output);
    }

    private static int getMex(char c1, char c2) {
        boolean hasZero = (c1 == '0' || c2 == '0');
        boolean hasOne = (c1 == '1' || c2 == '1');

        if (hasZero && hasOne) return 2;
        if (hasZero) return 1;
        return 0;
    }

    private static int getMexBlock(char c1, char c2, char p1, char p2) {
        boolean hasZero = (c1 == '0' || c2 == '0' || p1 == '0' || p2 == '0');
        boolean hasOne = (c1 == '1' || c2 == '1' || p1 == '1' || p2 == '1');

        if (hasZero && hasOne) return 2;
        if (hasZero) return 1;
        return 0;
    }
}