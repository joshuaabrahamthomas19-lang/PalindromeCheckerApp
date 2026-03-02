/**
 * PalindromeCheckerApp
 * UC11: Object-Oriented Palindrome Service
 * * We are now using OOPS! We've separated the "logic" from the "display".
 * The PalindromeService class is the 'expert' that knows how to check words,
 * and the PalindromeCheckerApp is the 'manager' that runs the program.
 * * @author Developer
 * @version 11.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 11.0");
        System.out.println("-------------------------------------------------");

        // --- UC11: Using the Service Object ---
        String input = "racecar";
        System.out.println("Input: " + input);

        // We create an "Instance" of our service class.
        PalindromeService service = new PalindromeService();

        // We ask the service to check the word for us.
        // We don't care HOW it checks it; we just care about the result.
        boolean isPalindrome = service.checkPalindrome(input);

        // Display the result returned by the service.
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}

/**
 * Service class that contains the actual business logic.
 * This is an example of Encapsulation and Single Responsibility.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * This method is reusable and can be called from anywhere.
     */
    public boolean checkPalindrome(String input) {
        // We'll use the efficient two-pointer logic here.
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false; // Not a palindrome.
            }
            start++;
            end--;
        }
        return true; // It is a palindrome.
    }
}