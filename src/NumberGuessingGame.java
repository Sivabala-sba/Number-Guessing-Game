import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to the number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100");

        while(playAgain){
            System.out.println("\nPlease select the difficulty level:");
            System.out.println("1. Easy (10 chances)");
            System.out.println("2. Medium (5 chances)");
            System.out.println("3. Hard (3 chances)");

            int difficulty = scanner.nextInt();
            int chances = 10;

            switch (difficulty){
                case 1:
                    chances = 10;
                    System.out.println("\nYou have selected Easy difficulty level. You have 10 chances.");
                    break;

                case 2:
                    chances = 5;
                    System.out.println("\nYou have selected Medium difficulty level. You have 5 chances.");
                    break;

                case 3:
                    chances = 3;
                    System.out.println("\nYou have selected Hard difficulty level. You have 3 chances.");
                    break;

                default:
                    System.out.println("\nInvalid choice. Defaulting to Medium defficulty (5 chances).");
                    break;
            }

            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nLet's start the game!");

            while(attempts < chances){
                System.out.println("\nEnter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if(userGuess == numberToGuess){
                    System.out.println("\nCongratulations! You guessed the correct number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                }
                else if(userGuess > numberToGuess){
                    System.out.println("Incorrect! The number is less than " + userGuess + ".");
                }
                else{
                    System.out.println("Incorrect! The number is greater than " + userGuess + ".");
                }
                System.out.println("Chances left: " + (chances - attempts));
            }

            if (!guessedCorrectly) {
                System.out.println("\nYou've run out of chances. The correct number was: " + numberToGuess);
            }

            System.out.println("\nDo you want to play again? (yes/no): ");
            scanner.nextLine();
            String response = scanner.nextLine().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("\nThank you for playing the Number Guessing Game!");
        scanner.close();
    }
}