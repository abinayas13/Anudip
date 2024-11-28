package numberformatexceptionpgm;
import java.util.Scanner;
public class NumberFormatExceptionpgm {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            // Attempt to convert the input to an integer
            int number = Integer.parseInt(input);

            // If parsing is successful, print the number
            System.out.println("You entered the number: " + number);

        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid integer
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            // Close the scanner to avoid resource leaks
            scanner.close();
        }
    }
}

 
