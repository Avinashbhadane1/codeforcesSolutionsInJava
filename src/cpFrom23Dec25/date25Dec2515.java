
//this one I did copy the solution because then I couldn't think of one
import java.util.*;
public class date25Dec2515 {
    static class Pair {
        long sharingCost;
        long maxShares;

        Pair(long sharingCost, long maxShares) {
            this.sharingCost = sharingCost;
            this.maxShares = maxShares;
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong(); // Read the number of test cases
        while (t-- > 0) {
            long n = scanner.nextLong(); // Number of residents
            long p = scanner.nextLong(); // Cost to share directly

            long[] a = new long[(int) n]; // Max shares for each resident
                    long[] b = new long[(int) n]; // Sharing costs for each resident

                    // Read the maximum number of residents each resident can share the announcement to
                    for (int i = 0; i < n; i++) {
                        a[i] = scanner.nextLong();
                    }

                    // Read the cost for each resident to share the announcement
                    for (int i = 0; i < n; i++) {
                        b[i] = scanner.nextLong();
                    }

                    // Create a list of pairs (sharing cost, max shares)
                    List<Pair> v = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        v.add(new Pair(b[i], a[i]));
                    }

                    // Sort the list based on sharing cost (ascending order)
                    Collections.sort(v, Comparator.comparingLong(pair -> pair.sharingCost));

                    long minimumCost = p; // Start with the cost of sharing to one resident directly
                    long alreadyShared = 1; // Start with one resident already informed

                    // Iterate over the sorted list
                    for (Pair pair : v) {
                        long canBeShared = pair.maxShares; // Max number of residents this resident can share with
                        long sharingCost = pair.sharingCost; // Cost for this resident to share

                        // If the sharing cost is greater than or equal to direct sharing cost, break
                        if (sharingCost >= p) {
                            break;
                        }

                        // If sharing with all possible residents exceeds total residents, adjust
                        if (alreadyShared + canBeShared > n) {
                            minimumCost += (n - alreadyShared) * sharingCost;
                            alreadyShared = n; // All residents are informed
                            break;
                        } else {
                            minimumCost += canBeShared * sharingCost; // Add cost for sharing
                            alreadyShared += canBeShared; // Update the count of informed residents
                        }
                    }

                    // Add the cost for the remaining residents to be informed directly
                    minimumCost += (n - alreadyShared) * p;
                    System.out.println(minimumCost); // Output the minimum cost for this test case
                }
                scanner.close();
            }

            // Helper class to store pairs of sharing cost and max shares

        }
