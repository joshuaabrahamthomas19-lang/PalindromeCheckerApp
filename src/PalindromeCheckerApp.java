/**
 * PalindromeCheckerApp
 * UC9: Recursive Palindrome Checker
 * * This version uses recursion to solve the problem.
 * We check the outermost characters and then ask the same
 * function to check the remaining inner part of the word.
 * @version 9.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 9.0");
        System.out.println("-------------------------------------------------");

        // --- UC9: Recursive Logic ---
        // Let's test with the word "madam".
        String input = "madam";
        System.out.println("Input: " + input);

        // We start our recursive check from index 0 to the last index of the string.
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Tell the user if it's a palindrome based on the recursive result.
        System.out.println("Is Palindrome?: " + isPalindrome);
    }

    /**
     * This is our recursive helper method.
     * It compares characters at the start and end and then moves inward.
     */
    private static boolean check(String s, int start, int end) {
        // --- BASE CASE ---
        // If the pointers have met or crossed, we've successfully checked everything.
        if (start >= end) {
            return true;
        }

        // --- RECURSIVE STEP ---
        // 1. Check if the current outer characters match.
        // 2. If they match, call this same method again for the inner substring.
        return (s.charAt(start) == s.charAt(end)) && check(s, start + 1, end - 1);
    }
}