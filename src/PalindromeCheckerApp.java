import java.util.*;

/**
 * PalindromeCheckerApp
 * UC12: Strategy Pattern for Palindrome Algorithms
 * * This is the most advanced version! We define a "Strategy" (a plan).
 * We can now switch between different algorithms (Stack or Deque)
 * instantly. This makes our code incredibly flexible and easy to grow.
 * @version 12.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 12.0 (Advanced Strategy Pattern)");
        System.out.println("-------------------------------------------------");

        String input = "level";
        System.out.println("Input: " + input);

        // --- UC12: Strategy Pattern in Action ---

        // 1. Let's use the Stack Strategy first
        PalindromeStrategy strategy = new StackStrategy();
        System.out.println("Testing with Stack Strategy: " + strategy.check(input));

        // 2. Now, we can swap to the Two-Pointer Strategy without changing the app logic
        strategy = new TwoPointerStrategy();
        System.out.println("Testing with Two-Pointer Strategy: " + strategy.check(input));
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Strategy 1: Using a Stack (LIFO logic)
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

/**
 * Strategy 2: Using Two Pointers (Efficient index-based logic)
 */
class TwoPointerStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}