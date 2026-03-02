/**
 * PalindromeCheckerApp
 * UC4: Character Array Based Palindrome Check
 * * We are now making the app more efficient by looking at characters
 * individually rather than creating whole new strings. [cite: 162]
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        // Let the user know the system is up and running. [cite: 10]
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 4.0");
        System.out.println("-------------------------------------------------");

        // --- UC4: Using a Char Array & Two-Pointer Strategy ---
        // This is the word we are testing this time. [cite: 174]
        String input = "radar";
        System.out.println("Input: " + input);

        // We break the word down into a simple list of characters. [cite: 150, 175]
        char[] chars = input.toCharArray();

        // We set up two markers: one at the very start and one at the very end. [cite: 152, 177, 179]
        int start = 0;
        int end = chars.length - 1;

        // We assume it's a palindrome until we find a reason to think otherwise. [cite: 181]
        boolean isPalindrome = true;

        // We walk toward the center from both sides, comparing characters as we go. [cite: 152, 182]
        while (start < end) {
            // If the characters at our markers don't match, it's not a palindrome. [cite: 161]
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break; // No need to keep looking if we already found a mismatch.
            }
            // Move the markers closer to each other for the next check. [cite: 152]
            start++;
            end--;
        }

        // Finally, tell the user what we found. [cite: 161]
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}