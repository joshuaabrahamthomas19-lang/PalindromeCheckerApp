import java.util.ArrayDeque; // Used for a high-performance double-ended queue.
import java.util.Deque;      // The interface that allows us to work with both ends of the queue.

/**
 * PalindromeCheckerApp
 * UC7: Deque-Based Optimized Palindrome Checker
 * * In this version, we use a Deque (Double-Ended Queue).
 * This is a smart way to check for palindromes because we can pull
 * characters from both the "front" and "back" at the same time to see if they match.
 * @version 7.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 7.0");
        System.out.println("-------------------------------------------------");

        // --- UC7: Deque Logic ---
        // We'll test using the word "refer".
        String input = "refer";
        System.out.println("Input: " + input);

        // We create our Deque to hold the characters of the word.
        Deque<Character> deque = new ArrayDeque<>();

        // We add every character from our word into the deque.
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // We assume it's a palindrome until we find a mismatch.
        boolean isPalindrome = true;

        // We keep comparing the first and last characters until we either
        // run out of characters or only have one left in the middle.
        while (deque.size() > 1) {
            // We pull one from the front and one from the back.
            // If they aren't the same, the word isn't a palindrome.
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // Output the final result to the user.
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}