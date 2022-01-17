package com.guessingGame;

// need to import this in order to take in user input
import java.util.Scanner;

/*
 * 

public class GuessMaster {
	private int currentPerson;
	private Person person1;
	private Person person2;
	private Person person3;

	// taking in three Person type objects as parameters
	public GuessMaster(Person person1, Person person2, Person person3) {
		currentPerson = 1;
		this.person1 = new Person(person1);
		this.person2 = new Person(person2);
		this.person3 = new Person(person3);
	}

	// accessor methods to help in iterating through each person
	public Person getPerson1() {
		return new Person(this.person1);
	}

	public Person getPerson2() {
		return new Person(this.person2);
	}

	public Person getPerson3() {
		return new Person(this.person3);
	}

	public void startGame() {
		// welcomes/greets the user to the guessing game
		System.out.println("Hello! Welcome to the guessing game.");
		Scanner scanner = new Scanner(System.in);

		// a for loop that will iterate through the three people starting at
		// person 1, then person2, then person 3. It updates the counter current person
		// each time
		for (int i = 0; i < 3; i++) {
			// currentPerson is initialized to 1 so guessing for Bill Gates runs below
			while (currentPerson == 1) {
				System.out.println('\n' + "You are guessing this person's birthday: " + this.person1.getName());
				System.out.println("Enter the date you are guessing in the format DD/MM/YYYY");

				// read in what the user input
				String dateguess = scanner.nextLine();

				// if the user input quit then leave the program. Otherwise check if the guess
				// is correct
				if (dateguess.equals("quit")) {
					System.out.println('\n' + "Bye! Thanks for playing.");
					System.exit(0);
				} else {
					// convert the user's input from a string to a Date for each instance variable
					Date date1 = new Date(dateguess);

					// check if the date the user entered is the same as the Bill Gate's birthday
					if (date1.equals(person1.getBirthday()) == true) {
						System.out.println("CORRECT. You got it!!");
						System.out.println(person1.toString());
						currentPerson++;

						// if the guess they entered isn't correct (meaning the equals method returned
						// false) then check if the guessed date is before Bill Gate's birthday
					} else if (date1.isBefore(person1.getBirthday()) == true) {
						System.out.println("Incorrect. Try a later date.");

						// the date the user entered isn't before Bill Gate's birthday so it must be
						// later
					} else {
						System.out.println("Incorrect. Try an earlier date.");
					}

				}

			}

			// currentPerson is 2 so user will start guessing for Elon Musk
			while (currentPerson == 2) {
				System.out.println('\n' + "You are guessing this person's birthday: " + this.person2.getName());
				System.out.println("Enter the date you are guessing in the format DD/MM/YYYY");

				// read in what the user input
				String date2quess = scanner.nextLine();

				// if the user input quit then leave the program. Otherwise, check if the guess
				// is correct
				if (date2quess.equals("quit")) {
					System.out.println('\n' + "Bye! Thanks for playing.");
					System.exit(0);
				} else {
					// convert the user's input from a string to a Date for each instance variable
					Date date2 = new Date(date2quess);

					// check if the date the user entered is the same as the Elon Musk's birthday
					if (date2.equals(person2.getBirthday()) == true) {
						System.out.println("CORRECT. You got it!!");
						System.out.println(person2.toString());
						currentPerson++;

						// if the guess they entered isn't correct (meaning the equals method returned
						// false) then check if the guessed date is before Elon Musk's birthday
					} else if (date2.isBefore(person2.getBirthday()) == true) {
						System.out.println("Incorrect. Try a later date.");

						// the date the user entered isn't before Elon Musk's birthday so it must be
						// later
					} else {
						System.out.println("Incorrect. Try an earlier date.");
					}

				}
			}

			// currentPerson is 3 so user will start guessing for Usain Bolt
			while (currentPerson == 3) {
				System.out.println('\n' + "You are guessing this person's birthday: " + this.person3.getName());
				System.out.println("Enter the date you are guessing in the format DD/MM/YYYY");

				// read in what the user input
				String date3quess = scanner.nextLine();

				// if the user input quit then leave the program. Otherwise, check if the guess
				// is correct
				if (date3quess.equals("quit")) {
					System.out.println('\n' + "Bye! Thanks for playing.");
					System.exit(0);
				} else {
					// convert the user's input from a string to a Date for each instance variable
					Date date3 = new Date(date3quess);

					// check if the date the user entered is the same as the Usain Bolt's birthday
					if (date3.equals(person3.getBirthday()) == true) {
						System.out.println("CORRECT. You got it!!");
						System.out.println(person3.toString());
						currentPerson++;

						// if the guess they entered isn't correct (meaning the equals method returned
						// false) then check if the guessed date is before Usain Bolt's birthday
					} else if (date3.isBefore(person3.getBirthday()) == true) {
						System.out.println("Incorrect. Try a later date.");

						// the date the user entered isn't before Usain Bolt's birthday so it must be
						// later
					} else {
						System.out.println("Incorrect. Try an earlier date.");
					}

				}

			}
		}
		System.out.println('\n' + "Thanks for playing. You guessed everyone correctly!");
	}
}

*/