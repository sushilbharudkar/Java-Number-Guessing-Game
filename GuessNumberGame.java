import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;

        int guess = 0;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a number between 1 and 100.");
        System.out.println("Try to guess it! You have " + maxAttempts + " attempts.\n");

        while (guess != number && attempts < maxAttempts) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Your guess is too high! Try again.\n");
            }
            else if (guess < number) {
                System.out.println("Your guess is too low! Try again.\n");
            }
            else {
                System.out.println("Congratulations! You guessed the correct number: " + number);
                System.out.println("It took you " + attempts + " attempts.");
            }
        }

        if (guess != number) {
            System.out.println("Sorry! You have used all " + maxAttempts + " attempts.");
            System.out.println("The correct number was: " + number);
        }

        System.out.println("\nThank you for playing!");
    }
}