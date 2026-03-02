/**
 * PalindromeCheckerApp
 * UC10: Case-Insensitive & Space-Ignored Palindrome
 * * This version handles complex sentences. It cleans the input by
 * removing spaces and symbols and converting everything to lowercase
 * so the check is "case-insensitive."
 * @version 10.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 10.0");
        System.out.println("-------------------------------------------------");

        // --- UC10: Normalization & Validation ---
        // A classic complex palindrome example.
        String input = "A man a plan a canal Panama";
        System.out.println("Original Input: " + input);

        // STEP 1: Normalize the string.
        // We convert to lowercase and use a "Regex" to replace everything
        // that isn't a letter or number with nothing (empty string).
        String normalized = input.toLowerCase().replaceAll("[^a-zA-Z0-0]", "");
        System.out.println("Normalized Text: " + normalized);

        // STEP 2: Use symmetry logic to check the result.
        boolean isPalindrome = true;
        int length = normalized.length();

        // Compare characters from both ends moving toward the middle.
        for (int i = 0; i < length / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Final report.
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}