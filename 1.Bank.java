
package bank;
public class Bank {

    // Instance variable to store the balance amount
    private double amount;

    // Parameterized constructor to initialize 'amount' with 10000
    public Bank(double initialAmount) {
        this.amount = initialAmount;
    }

    // Method to withdraw an amount
    public void withdraw(double withdrawalAmount) {
        // Check if the withdrawal is possible using a ternary operator
        String message = (amount >= withdrawalAmount) ? 
                          "Withdrawal successful. New balance: " + (amount - withdrawalAmount) :
                          "Insufficient funds. Withdrawal failed.";
        
        // If withdrawal is successful, update the balance
        if (amount >= withdrawalAmount) {
            amount -= withdrawalAmount;
        }

        // Print the message
        System.out.println(message);
    }

    // Method to deposit an amount
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposited: " + depositAmount + ". New balance: " + amount);
    }

    // Method to display the total balance
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create a Bank object with initial balance 10000
        Bank account = new Bank(10000);

        // Withdraw 2000 from the account
        account.withdraw(2000);

        // Deposit 5000 into the account
        account.deposit(5000);

        // Display the final balance
        account.displayBalance();
  

    
        
    }
    
}
