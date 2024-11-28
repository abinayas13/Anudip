package votingapp;
import java.util.Scanner;

// Custom exception class for underage voting attempt
class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}
public class VotingApp {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        try {
            
            // Taking user's age as input
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            
            // Check if the user is eligible to vote
            if (age < 18) {
                
                // Throw custom exception if age is less than 18
                throw new UnderageException("You must be at least 18 years old to vote.");
            }
            
            // If age is 18 or above, allow the user to vote
            System.out.println("You are eligible to vote! Please proceed with voting.");
        } catch (UnderageException e) {
            
            // Handle the exception if age is less than 18
            System.out.println(e.getMessage());
        } catch (Exception e) {
            
            // Catch other exceptions (e.g., invalid input)
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            
            // Close the scanner in the finally block to ensure it is always closed
            scanner.close();
        }
    }
}


