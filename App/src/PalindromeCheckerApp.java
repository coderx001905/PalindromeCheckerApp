public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String str = "A man a plan a canal Panama";

        // Normalize string (remove spaces and convert to lowercase)
        str = str.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;
        int start = 0;
        int end = str.length() - 1;

        // Apply palindrome logic
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}