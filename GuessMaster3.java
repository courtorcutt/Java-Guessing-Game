package com.guessingGame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class GuessMaster3 {
	private HashSet<GuessablePerson<?>> people; // hashset to store each Person added
	private int numPoints; // keep track of the total number of points if user guesses correctly

	public GuessMaster3() {
		// initialize all the instance variables to zero/empty
		people = new HashSet<>();
		numPoints = 0;
	}

	// this will add people into the people hashset of GuessablePerson objects
	public <M extends Person> void addPerson(M people, double difficulty) {
		this.people.add((GuessablePerson<?>) new GuessablePerson<>(people, difficulty).clone());
	}

	// this will access the people in the hashset of people
	public HashSet<GuessablePerson<?>> getPeople() {
		return (HashSet<GuessablePerson<?>>) this.people.clone();
	}

	public void startGame() {

		// greet the user after they are informed about how many people are in this guessing game
		System.out.println("Welcome! Let's start the game!");

		// create the iterator peopleIterator of GuessablePerson objects to go through each person
		Iterator<GuessablePerson<?>> peopleIterator = people.iterator();	

		try {
			File myFile = new File(
					"/Users/courtneyorcutt/Desktop/Queens Classes/ELEC 279/Courtney_Orcutt_20155399_Assignment3/test.txt");
			Scanner myScanner = new Scanner(new FileInputStream(myFile));

			// show the starting message for the current person being guessed.
			GuessablePerson<?> currentPerson = peopleIterator.next();
			System.out.println(currentPerson.startMessage());

			// while either the file has more lines or there are more people to guess, run this while loop
			while (peopleIterator.hasNext() || myScanner.hasNextLine()) {

				// get the next line in the file and set up a date called person's birthday
				String dateguess = myScanner.nextLine();
				Date personBirthday;

				// allow the user to end if they type quit and display ending message
				System.out.println('\n' + "If you would like to stop, type \"quit\" to exit");
				
				if (dateguess.equals("quit")) {
					System.out.println('\n' + "Bye! Thanks for playing.");
					System.exit(0);
				}

				try {
					// try to convert the text input to a date
					// if the date throws an exception, print the exception message
					personBirthday = new Date(dateguess);

					// first check if the user guessed date from the file is the same as the current person's
					// birthday, if it is return true and get the total amount of points they receive
					if (personBirthday.equals(currentPerson.getBirthday()) == true) {
						System.out.println(currentPerson.closingMessage());
						numPoints = currentPerson.getAwardedPointNumber() + numPoints;
						System.out.println("Your total number of points is " + numPoints);
						System.out.println(" ");

						// the birthday guess isn't correct, so determine through comparison if
						// they need to guess a later or earlier date.
					} else {
						if (personBirthday.compareTo(currentPerson.getBirthday()) < 0) {
							System.out.println("Incorrect. Try a later date.");
						}
						if (personBirthday.compareTo(currentPerson.getBirthday()) > 0) {
							System.out.println("Incorrect. Try an earlier date.");
						}
					}

					// display the exception message from IncorrectDateException class
				} catch (IncorrectDateException e) {
					System.out.println(e.getMessage());
				}

			}

		}

		// if the file can't be found, print that is doesn't exist
		catch (FileNotFoundException e) {
			System.out.println("The file does not exist");
		}
	}
	
}
