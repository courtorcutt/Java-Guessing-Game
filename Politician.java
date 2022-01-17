package com.guessingGame;

// Politician is a subclass of Person
public class Politician extends Person {
	private String party; // immutable

	// the constructor for Politician
	public Politician(String name, Date birthday, String party) {
		// initialize the parent class instance variables
		super(name, birthday);

		// initialize the Politician instance variable
		this.party = party;
	}

	// accessor method for party
	public String getParty() {
		return this.party;
	}

	// mutator method for party
	public void setParty(String party) {
		this.party = party;
	}

	// clone method of return type Politician
	public Politician clone() {
		Politician copy = (Politician) super.clone();
		return copy;
	}

	// override the toString method with additional Politician specific information
	public String toString() {
		return (super.toString() + ". They are a member of the " + this.party + " party.");
	}

	// return what type the Object is
	public String personType() {
		return ("politician");
	}
}
