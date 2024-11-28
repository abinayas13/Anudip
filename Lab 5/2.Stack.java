
package stackexample;
import java.util.Stack;
public class StackExample {

    public static void main(String[] args) {
    
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push 10 elements into the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        // Remove 4 elements from the stack
        for (int i = 0; i < 4; i++) {
            stack.pop();
        }

        // Display the remaining elements in the stack
        System.out.println("Remaining elements in the stack: " + stack);
    }
}

