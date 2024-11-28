
package maxnumber;
import java.util.Scanner;
public class MaxNumber {

    public static void main(String[] args) {
      
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Use the ternary operator to find the maximum number
        int max = (num1 > num2) ? num1 : num2;
        
        // Output the maximum number
        System.out.println("The maximum number is: " + max);
        
        // Close the scanner
        scanner.close();
    }
}
