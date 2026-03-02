import java.util.LinkedList; // Needed for the Queue implementation.
import java.util.Queue;      // Standard tool for First-In-First-Out data.
import java.util.Stack;      // Continued use of Last-In-First-Out tool.

/**
 * PalindromeCheckerApp
 * UC6: Queue + Stack Based Palindrome Check
 * * We are comparing two different behaviors here:
 * 1. Queue (FIFO): Gives us characters in their original order.
 * 2. Stack (LIFO): Gives us characters in reverse order.
 * If these two sequences match perfectly, the word is a palindrome.
 * @version 6.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 6.0");
        System.out.println("-------------------------------------------------");

        // --- UC6: Queue + Stack Logic ---
        // Let's validate the word "civic".
        String input = "civic";
        System.out.println("Input: " + input);

        // We set up both structures to hold our characters.
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // We put every character into BOTH the queue and the stack.
        for (char c : input.toCharArray()) {
            queue.add(c);  // Enqueue: enters at the back.
            stack.push(c); // Push: enters at the top.
        }

        // We start by assuming it's a palindrome.
        boolean isPalindrome = true;

        // We compare them by pulling one character from the front of the queue
        // and one from the top of the stack at the same time.
        while (!queue.isEmpty()) {
            // dequeue() vs pop()
            if (queue.remove() != stack.pop()) {
                isPalindrome = false; // Mismatch means it's not symmetric.
                break;
            }
        }
        // Final report to the console.
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}