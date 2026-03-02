/**
 * PalindromeCheckerApp
 * UC3: Reverse String Based Palindrome Check
 * * Description:
 * This class checks whether a string is a palindrome by reversing
 * the string and comparing it with the original value[cite: 118].
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     */
    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("Welcome to the Palindrome Checker Management System"); // [cite: 45]
        System.out.println("Version : 3.0"); // [cite: 127]
        System.out.println("-------------------------------------------------");

        // --- UC3: String Reverse Logic ---
        String input = "racecar"; // [cite: 100]
        String reversed = ""; // [cite: 121]

        // Iterate from the last character to the first[cite: 120, 136].
        // Length - 1 is the index of the last character.
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}