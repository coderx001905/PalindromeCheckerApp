import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: Reverse String
    static boolean reverseMethod(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method 2: Two Pointer
    static boolean twoPointerMethod(String str) {
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

    // Method 3: Stack
    static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "madamimadam";

        long start, end;

        // Reverse method timing
        start = System.nanoTime();
        reverseMethod(str);
        end = System.nanoTime();
        System.out.println("Reverse Method Time: " + (end - start) + " ns");

        // Two pointer timing
        start = System.nanoTime();
        twoPointerMethod(str);
        end = System.nanoTime();
        System.out.println("Two Pointer Method Time: " + (end - start) + " ns");

        // Stack method timing
        start = System.nanoTime();
        stackMethod(str);
        end = System.nanoTime();
        System.out.println("Stack Method Time: " + (end - start) + " ns");
    }
}