
package dividebyzeroexception;
import java.util.Scanner;
public class DivideByZeroException {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Take input from the user
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // Close scanner resource
            scanner.close();
        }
    }
}

