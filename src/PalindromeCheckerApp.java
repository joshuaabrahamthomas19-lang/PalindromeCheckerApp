public class PalindromeCheckerApp {


    public static void main(String[] args) {
        // --- UC1: Welcome Message ---
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 2.0");
        System.out.println("System initialized successfully.");
        System.out.println("-------------------------------------------------");

        // --- UC2: Hardcoded Palindrome Logic ---
        // Storing a predefined string literal [cite: 64, 75]
        String input = "madam";
        System.out.println("Input text: " + input); // [cite: 96]

        boolean isPalindrome = true;

        // Loop only till half of the string length [cite: 92, 93]
        for (int i = 0; i < input.length() / 2; i++) {
            // Compare characters from both ends [cite: 76]
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        // Conditional statement to display result [cite: 65, 78]
        System.out.println("Is it a Palindrome?: " + isPalindrome); // [cite: 97]
    }
}