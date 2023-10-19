package oasis.assignment;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int lowerBound = 1;
		int upperBound = 10;
		int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

		int attempts = 0;
		boolean hasGuessedCorrectly = false;

		System.out.println("Welcome to the Guess the Number game!");
		System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");

		while (!hasGuessedCorrectly) {
			System.out.print("Enter your guess: ");
			int userGuess = scanner.nextInt();
			attempts++;

			if (userGuess == numberToGuess) {
				hasGuessedCorrectly = true;
				System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly.");
				System.out.println("It took you " + attempts + " attempts.");
			} else if (userGuess < numberToGuess) {
				System.out.println("Try a higher number.");
			} else {
				System.out.println("Try a lower number.");
			}
		}

		scanner.close();
	}
}
