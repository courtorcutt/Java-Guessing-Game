package com.guessingGame;

// Guessable Interface
public interface Guessable extends Comparable<Person>{
	public String startMessage();
	public String closingMessage();
	public int getAwardedPointNumber();
	
}
