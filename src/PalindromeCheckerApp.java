import java.util.LinkedList; // We're using the LinkedList class to hold our characters.

/**
 * PalindromeCheckerApp
 * UC8: Linked List Based Palindrome Checker
 * * This version uses a LinkedList to store characters. Since LinkedList in Java
 * supports double-ended operations, we can easily compare characters from
 * both the start and end of the list.
 * * @author Developer
 * @version 8.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 8.0");
        System.out.println("-------------------------------------------------");

        // --- UC8: Linked List Logic ---
        // Let's test the app with the word "level".
        String input = "level";
        System.out.println("Input: " + input);

        // We create a LinkedList to store each character of the word.
        LinkedList<Character> list = new LinkedList<>();

        // Add every character of the string into the linked list.
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // We assume it's a palindrome initially.
        boolean isPalindrome = true;

        // We continue comparing characters as long as there's more than one left.
        // We remove one from the very front and one from the very end in each step.
        while (list.size() > 1) {
            // If the first and last characters don't match, it's not a palindrome.
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result of our comparison.
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}