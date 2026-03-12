import java.util.Scanner;
public class palindrom10 {
    public static boolean isPalindrome(String input) {

        // Normalize string: remove spaces and convert to lowercase
        input = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = input.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The given string is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }

}
