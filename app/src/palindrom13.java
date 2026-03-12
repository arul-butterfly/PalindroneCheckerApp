import java.util.Scanner;
public class palindrom13 {
    // Approach 1: Using StringBuilder reverse
    public static boolean isPalindromeUsingStringBuilder(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanStr).reverse().toString();
        return cleanStr.equals(reversed);
    }

    // Approach 2: Using two-pointer technique
    public static boolean isPalindromeTwoPointer(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = cleanStr.length() - 1;
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Approach 3: Using recursion
    public static boolean isPalindromeRecursive(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return checkRecursive(cleanStr, 0, cleanStr.length() - 1);
    }

    private static boolean checkRecursive(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return checkRecursive(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker Performance Comparison ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Approach 1
        long start1 = System.nanoTime();
        boolean result1 = isPalindromeUsingStringBuilder(input);
        long end1 = System.nanoTime();
        long duration1 = end1 - start1;

        // Approach 2
        long start2 = System.nanoTime();
        boolean result2 = isPalindromeTwoPointer(input);
        long end2 = System.nanoTime();
        long duration2 = end2 - start2;

        // Approach 3
        long start3 = System.nanoTime();
        boolean result3 = isPalindromeRecursive(input);
        long end3 = System.nanoTime();
        long duration3 = end3 - start3;

        // Display results
        System.out.println("\nResults:");
        System.out.println("Using StringBuilder: " + result1 + " | Time: " + duration1 + " ns");
        System.out.println("Using Two-Pointer  : " + result2 + " | Time: " + duration2 + " ns");
        System.out.println("Using Recursion    : " + result3 + " | Time: " + duration3 + " ns");
    }
}
