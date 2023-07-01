// Import the required classes and packages   
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

   public static void main(String[] args) {
        
        // Declare and Initialize the variables for storing user's guess and number of tries
        int Guess; 
        int NumberOfTries = 0;

        // Using rand function to generate a random number between 0 to 500
        Random rand = new Random();
        int GuessingNumber = rand.nextInt(500);     

        // Using Scanner Object for user input
        Scanner input = new Scanner (System.in);

        // Using Boolean to check if the user has guessed the correct number
        boolean win = false;

        // Starting the game loop
        while (win == false) {

            System.out.println("Guess a number between 1 to 500: "); 
            Guess = input.nextInt(); 
            NumberOfTries++;
            
            // Checking if the user's guess matches the generated number
            if (Guess == GuessingNumber) { 
                win = true;
            }
            
            // If the guess is lower than the generated number, generate a feedback
            else if (Guess < GuessingNumber) {
                System.out.println("Your guess is too low" + '\n');
            }

            // If the guess is higher than the generated number, generate a feedback
            else if (Guess > GuessingNumber) {
                System.out.println("Your guess is too high" + '\n');
            }
        }

        // Display the result after the user guesses the correct number
        System.out.println('\n' + "You win!");
        System.out.println("The number was" + '\t' + GuessingNumber);
        System.out.println("It took you " + NumberOfTries + " tries");
        System.out.println('\n' + "You did a very Good Job at Guessing the Number!");
    }
}