import java.util.*;

public class cf1691B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read the number of test cases
        while (t-- > 0) {
            long n = scanner.nextLong(); // Read the number of students
            long[] sizes = new long[(int) n];
            for (int i = 0; i < n; i++) {
                sizes[i] = scanner.nextLong(); // Read the shoe sizes for each student
            }

            Map<Long, Long> freq = new HashMap<>(); // Map to store frequency of each shoe size
            for (long size : sizes) {
                freq.put(size, freq.getOrDefault(size, 0L) + 1); // Count frequency of each shoe size
            }

            boolean flag = false; // Flag to check if a valid shuffling is possible
            for (long count : freq.values()) {
                if (count == 1) { // If any shoe size appears only once, shuffling is not possible
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println(-1); // Output -1 if shuffling is not possible
                continue;
            }

            List<Long> students = new ArrayList<>(); // List to store the permutation of students
            for (long i = 1; i <= n; i++) {
                students.add(i); // Initialize the permutation with student indices
            }

            int l = 0, r = 0;
            while (r < n) { // Iterate over the shoe sizes
                if (sizes[l] == sizes[r]) {
                    r++;
                } else {
                    // Rotate the segment of students to ensure no student gets their own shoes
                    Collections.rotate(students.subList(l, r), -1);
                    l = r;
                }
            }
            // Rotate the last segment
            Collections.rotate(students.subList(l, r), -1);

            for (long student : students) { // Output the permutation
                System.out.print(student + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

// Time Complexity (TC): O(nlogn) = O(10^5*log2(10^5)) = O(10^5*17) = O(10^6)
// Space Complexity (SC): O(n) = O(10^5)
