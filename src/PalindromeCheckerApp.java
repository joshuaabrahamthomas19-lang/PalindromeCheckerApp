import java.util.*;

/**
 * PalindromeCheckerApp
 * UC13: Performance Comparison
 * * In this final version, we aren't just checking palindromes; we are
 * benchmarking our code. We measure how many nanoseconds each algorithm
 * takes so we can decide which approach is best for large data.
 * @version 13.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 13.0 (Performance Benchmarking)");
        System.out.println("-------------------------------------------------");

        String input = "level";
        System.out.println("Input: " + input);

        // --- UC13: Measuring Execution Time ---

        // Let's test the Stack Strategy
        PalindromeStrategy stackStrategy = new StackStrategy();
        measurePerformance(stackStrategy, "Stack Strategy", input);

        // Let's test the Two-Pointer Strategy
        PalindromeStrategy pointerStrategy = new TwoPointerStrategy();
        measurePerformance(pointerStrategy, "Two-Pointer Strategy", input);
    }

    /**
     * This method acts as our stopwatch.
     * It records the time, runs the check, and then calculates the difference.
     */
    public static void measurePerformance(PalindromeStrategy strategy, String name, String input) {
        // Capture the start time in nanoseconds
        long startTime = System.nanoTime();

        // Run the actual algorithm
        boolean result = strategy.check(input);

        // Capture the end time
        long endTime = System.nanoTime();

        // Calculate the duration
        long duration = endTime - startTime;

        System.out.println("\n--- " + name + " ---");
        System.out.println("Is Palindrome?: " + result);
        System.out.println("Execution Time: " + duration + " ns");
    }
}

// --- Strategy Pattern Interface and Classes (from UC12) ---

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

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