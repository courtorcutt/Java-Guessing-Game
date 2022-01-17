package com.guessingGame;

public abstract class Person implements Cloneable{
	private String name; // immutable
	private Date birthday; // mutable

	public Person(String name, Date birthday) {
		this.name = name; // string object is immutable -> so no privacy leak
		this.birthday = (Date) birthday.clone(); // new date type object to avoid privacy leak
	}
	
	// accessor methods for instance variables
	public String getName() {
		return this.name;
	}

	public Date getBirthday() {
		return (Date) birthday.clone(); // avoids privacy leak
	}


	// mutator methods for instance variables
	public void setName(String name) {
		this.name = name;
	}

	public void setBirthday(Date birthday) {
		this.birthday = (Date) birthday.clone();
	}

	// method to help in printing birthday of people passed in
	public String toString() {
		return (this.name + " was born on " + this.birthday.getDay() + "/" + this.birthday.getMonth() + "/"
				+ this.birthday.getYear());
	}

	// abstract methods personType and clone -> used in both subclasses of Singer and Politician
	public abstract String personType();
	
	public Object clone() {
		try {
			Person copy = (Person) super.clone();
			// date is mutable so has to be cloned in seperate line
			copy.birthday = (Date) birthday.clone();
			return copy;
		} catch (CloneNotSupportedException e) {
			return null; 
		}
	}


}
