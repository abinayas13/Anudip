
package swapnumbers;
import java.util.Scanner;
public class SwapNumbers {

    public static void main(String[] args) {
              // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Display the numbers before swapping
        System.out.println("Before swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        // Swapping using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        // Display the numbers after swapping
        System.out.println("After swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        // Close the scanner
        scanner.close();
    }
}

