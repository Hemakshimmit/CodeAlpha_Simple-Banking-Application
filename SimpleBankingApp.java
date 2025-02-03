import java.util.Scanner;

public class SimpleBankingApp {

    private static double balance = 0.0; // Initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        // Start the program
        do {
            // Display menu
            System.out.println("\nWelcome to the Simple Banking Application!");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please choose an option (1-4): ");
            
            // Capture user input
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    // Deposit money
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 2:
                    // Withdraw money
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 3:
                    // Check balance
                    checkBalance();
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Thank you for using the Simple Banking Application! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, please select a valid option.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Deposit method
    public static void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Your current balance is: " + balance);
    }

    // Withdraw method
    public static void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Your current balance is: " + balance);
        } else {
            System.out.println("Insufficient balance! Your current balance is: " + balance);
        }
    }

    // Check balance method
    public static void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}
