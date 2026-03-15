import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String str = "hello";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue characters and push into stack
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
            stack.push(str.charAt(i));
        }

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            System.out.println("Queue (FIFO): " + queue.remove());
            System.out.println("Stack (LIFO): " + stack.pop());
        }
    }
}