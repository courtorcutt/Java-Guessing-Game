package com.guessingGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner; //need to import this in order to take in user input

/*
 * 
 * 
public class GuessMaster2 {
	private Person[] people; // array to store each Person added
	private int numPoints; // keep track of the total number of points
	private int numPeople; // keep track of the number of people in array

	// two boolean values to help me in while loops below
	boolean leaveGame;
	boolean Guessed;

	public GuessMaster2() {
		// initialize all the instance variables
		people = new Person[0];
		numPoints = 0;
		numPeople = 0;
		leaveGame = false;
		Guessed = false;
	}

	public void addPerson(Person personObject) {
		// will add to the people array of objects Person and store how many people are
		// added by iterating numPeople each time
		people = Arrays.copyOf(people, people.length + 1);
		people[people.length - 1] = personObject;
		numPeople++;
	}

	// this method will randomly choose a person to guess
	public Person chosenPerson() {
		Random rnd = new Random();
		// from the three people in the people array, a random index (0,1,2) will be
		// chosen to be guessed
		return people[rnd.nextInt(people.length)];
	}

	public void startGame() {

		// greet the user and inform them how many people are in this guessing game
		System.out.println("Welcome! Let's start the game!");
		System.out.println("There are " + numPeople + " people used in this game");

		// while the user hasn't entered quit (meaning leave game is false), then keep
		// going through the while loop quessing new people
		while (!leaveGame) {

			// as a new person is chosen to be guessed in the game, the Guessed variable
			// needs to be set to false. It is only true if the user guesses correctly.
			Guessed = false;

			// choose a new person at random and clone it. Then print the starting message
			// and set up the scanner.
			Person person = chosenPerson().clone();
			System.out.println('\n' + person.startMessage());

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the date you are guessing in the format DD/MM/YYYY.");

			// This section is a while loop that will keep running until the user guesses
			// the randomly chosen person correctly. Once the user guesses the correct
			// birthday, the Guessed variable becomes true. Then the code goes back to the
			// outer while loop and picks a new person to be guessed and the Guessed
			// variable gets reset to false. This while loop will then run all over again.
			// To get out of the game completely, the user must enter quit.
			while (!Guessed) {
				String dateguess = scanner.nextLine();

				// if the person enters quit, leave the game and exit
				if (dateguess.equals("quit")) {
					System.out.println('\n' + "Bye! Thanks for playing.");
					leaveGame = true;
					System.exit(0);
				}

				// check if the date the user entered is the same as the randomly chosen
				// person's birthday. keep running this loop until the user guesses correctly
				Date personBirthday = new Date(dateguess);

				// if the user guesses correctly, meaning the two dates are equal. Then the code
				// will get out of this while loop since Guessed becomes true. A new person
				// will be chosen randomly then.
				if (personBirthday.equals(person.getBirthday()) == true) {
					System.out.println(person.closingMessage());

					// let the user know how many points they got from guessing correctly
					System.out.println("You won " + person.getAwardedPointNumber() + " points in this round.");

					// update the total points the user has in the numPoints variable and print it
					numPoints = person.getAwardedPointNumber() + numPoints;
					System.out.println("Your total number of points is " + numPoints + ".");

					// set Guessed to true will exit the while loop and goes to the larger one
					Guessed = true;

				} else {
					// connected to the Date class where it compares the randomly chosen person's
					// birthday and the user's guessed birthday. It will let the user know which
					// part of their guess is wrong -> such as an earlier or later date must be
					// guessed.
					personBirthday.incorrectDateComparisons(person.getBirthday());
					System.out.println('\n' + "Enter a different guess in the format DD/MM/YYYY:");
				}
			}
		}
	}
}
*/
