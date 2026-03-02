import java.util.Stack; // We need to bring in the Stack tool from Java's library.

/**
 * PalindromeCheckerApp
 * UC5: Stack-Based Palindrome Checker
 * * In this version, we use a Stack to reverse the word. Since a stack gives us
 * items back in reverse order (LIFO), it's a great way to verify a palindrome.
 * @version 5.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 5.0");
        System.out.println("-------------------------------------------------");

        // --- UC5: Stack Logic ---
        // Let's test with the word "noon".
        String input = "noon";
        System.out.println("Input: " + input);

        // We create a Stack specifically to hold characters.
        Stack<Character> stack = new Stack<>();

        // First, we "push" every character of our word onto the stack.
        // As we do this, the characters pile up one on top of the other.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // We assume it's a palindrome until proven otherwise.
        boolean isPalindrome = true;

        // Now, we "pop" characters off the stack one by one.
        // Because it's a stack, we get them back in reverse order.
        for (char c : input.toCharArray()) {
            // We compare the original character with the one we just pulled off the top.
            if (c != stack.pop()) {
                isPalindrome = false; // If they don't match, it's not a palindrome.
                break;
            }
        }

        // Share the final result.
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}