package com.guessingGame;

public class GuessablePerson<T extends Person> implements Cloneable, Guessable{
	// private instance variables
	private T person;
	private double difficulty;
	
	
	// unable to avoid privacy leak in the constructor
	public GuessablePerson(T person, double difficulty){ 
		this.person = person;
		this.difficulty = difficulty;
	}
	
	public int compareTo(Person otherPerson) {
		// person passed in birthday is older from comparing the years, so return 1
		if(this.person.getBirthday().getYear() < otherPerson.getBirthday().getYear()) {
			return 1;
		// person passed in birthday is younger from comparing the years, so return -1
		} else if(this.person.getBirthday().getYear() > otherPerson.getBirthday().getYear()) {
			return -1;
		// person passed in birthday is older from comparing the months, so return 1
		} else if (this.person.getBirthday().getMonth() < otherPerson.getBirthday().getMonth()) {
			return 1;
		// person passed in birthday is younger from comparing the months, so return -1
		} else if(this.person.getBirthday().getMonth() > otherPerson.getBirthday().getMonth()) {
			return -1;
		} else if(this.person.getBirthday().getDay() < otherPerson.getBirthday().getDay()) {
			return 1;
		} else if(this.person.getBirthday().getDay() > otherPerson.getBirthday().getDay()) {
			return -1;
		} 
		
		// two people are the same age (have same birthday), so one with earlier alphabet letter comes first
		return this.person.getName().compareTo(otherPerson.getName());
		// will return a positive # if the otherPerson's name comes before alphabetically than the person's name
		// will return 0 if the names are the same
		// will return a negative # if otherPerson's name comes after alphabetically than person's name
		
	}
	
	// methods to help in GuessMaster3
	public String startMessage() {
	return "Guess the birthday of the " + person.personType()+ " " + person.getName();
	}
	
	public String closingMessage() {
	return "Congratulations! You were correct, " + person.toString();
	}
	
	public int getAwardedPointNumber() {
		double points = this.difficulty*100; 
		return (int) points;
	}
	
	
	// clone method implementing cloneable
	public GuessablePerson<T> clone() {
		try {
			GuessablePerson<T> copy =  (GuessablePerson<T>) super.clone();
			copy.person = (T) person.clone();
			return copy;
		} catch (CloneNotSupportedException e) {// This should not happen.
			return null; // To keep compiler happy.
		}
	}
	
	// this will allow me to access each person's birthday to help compare the dates
	public Date getBirthday() {
		return (Date) this.person.getBirthday().clone();
	}
	
}
