package com.guessingGame;

public class IncorrectDateException extends Exception{

	public IncorrectDateException(String dateString) {
		// the message I want displayed when error is caught
		super("The date you have entered, " + dateString + " is not a valid input");
	}
	
}
