// Import the required classes and packages 
import java.util.Scanner;

// Create ATM Interface class to implement the ATM functionality  
public class ATMInterface {

    // Main method starts  
    public static void main(String[] args) {

        // Declare and initialize balance, withdraw, and deposit  
        int balance = 100000;
        int withdraw;
        int deposit;

        // Create scanner class object to get  the choice of user  
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ATM - Automated Teller Machine");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an operation:");

            int choice = scanner.nextInt();   // Get choice from the user  

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to be withdrawn:");

                    withdraw = scanner.nextInt();   // Get the withdrawal money amount from the user  

                    // Check whether the balance is greater than or equal to the withdrawal amount  
                    if (balance >= withdraw) {
                        balance -= withdraw;   // Remove the withdrawl amount from the total balance  
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");   // Show a custom error message   
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter amount to be deposited:");
 
                    deposit = scanner.nextInt();     // Get deposit amount from the user  

                    balance += deposit;       // Add the deposit amount to the total balance  
                    System.out.println("Your money has been successfully deposited");
                    System.out.println();
                    break;
 
                case 3:     // Displaying the total balance of the user  
                    System.out.println("Balance: " + balance);
                    System.out.println();
                    break;
 
                case 4:   // Exit from the menu  
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
                    System.out.println();
                    break;
            }
        }
    }
}

  
