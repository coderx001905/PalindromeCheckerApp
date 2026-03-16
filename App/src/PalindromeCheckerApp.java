class PalindromeCheckerApp {

    // Method to check palindrome
    public boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {

        String str = "madam";

        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}