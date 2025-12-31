import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class beginnerI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int totalElements = 2 * n;

                int[] a = new int[totalElements];
                for (int i = 0; i < totalElements; i++) {
                    a[i] = sc.nextInt();
                }

                int[] countLeft = new int[n + 1];
                for (int i = 0; i < n; i++) {
                    countLeft[a[i]]++;
                }

                List<Integer> twos = new ArrayList<>();
                List<Integer> zeroes = new ArrayList<>();
                List<Integer> ones = new ArrayList<>();
                for (int i = 1; i <= n; i++) {
                    if (countLeft[i] == 2) {
                        twos.add(i);
                    } else if (countLeft[i] == 0) {
                        zeroes.add(i);
                    } else {
                        ones.add(i);
                    }
                }

                List<Integer> l = new ArrayList<>();
                List<Integer> r = new ArrayList<>();

                int targetSize = 2 * k;
                int pairsToTake = Math.min(twos.size(), k);

                for (int i = 0; i < pairsToTake; i++) {
                    int valLeft = twos.get(i);
                    int valRight = zeroes.get(i);

                    l.add(valLeft);
                    l.add(valLeft);

                    r.add(valRight);
                    r.add(valRight);
                }

                int remainingSlots = targetSize - l.size();

                for (int i = 0; i < remainingSlots; i++) {
                    int val = ones.get(i);
                    l.add(val);
                    r.add(val);
                }
                printList(l);
                printList(r);
            }
        }
        sc.close();
    }

    // Helper method to print lists in the required format
    private static void printList(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(i == list.size() - 1 ? "" : " ");
        }
        System.out.println(sb);
    }
}