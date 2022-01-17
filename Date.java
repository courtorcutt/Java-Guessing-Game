package com.guessingGame;

public class Date implements Cloneable, Comparable<Date> {

	// static inner class Months
	private static class Months {

		public static int getDays(int month) {
			switch (month) {
			// months are January, March, May, July, August, October, December
			case 1, 3, 5, 7, 8, 10, 12:
				return 31; // all have 31 days in given month

			// months are April, June, September and November
			case 4, 6, 9, 11:
				return 30; // all have 30 days in the given month

			// check if the month is February -> if leap year, there will be 29 days
			case 2:
				return 29;

			}
			return 0;
		}

	}

	// Outer Date class instance variables
	private int day;
	private int month;
	private int year;

	// Date class constructor
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// implements Cloneable using the better clone method
	public Date clone() {
		// uses object class's clone method which will create a copy of the date and return it
		try {
			Date copy = (Date) super.clone();
			return copy;
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	// constructor which can create a date
	public Date(String dateEntered) throws IncorrectDateException {
			// will check if the entered string is too long or too short before turning the string into integers
			// if the text in the txt file is too long or too short for a date, it will throw the error and skip code underneath
			if (dateEntered.length() > 10 || dateEntered.length() < 10) {
				throw new IncorrectDateException(dateEntered);
			}

			// turns the string input into integers by creating day, month and year substrings
			this.day = Integer.parseInt(dateEntered.substring(0, 2));
			this.month = Integer.parseInt(dateEntered.substring(3, 5));
			this.year = Integer.parseInt(dateEntered.substring(6, 10));
			int dayResult = Months.getDays(this.month);

			// now compare the integer values of day, month and year to see if they throw exceptions too
			if (day < 1 || month < 1 || year < 1 || month > 12 || day > dayResult) {
				throw new IncorrectDateException(dateEntered);
			}

	}

	// accessor methods for the three instance variables
	public int getDay() {
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	// mutator methods for the three instance variables
	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// equals method that compares the contents of two Date objects
	public boolean equals(Date date) {
		// only if all Date variables are equal will equals method return true,
		// otherwise it will return false
		if (this.day == date.day && this.month == date.month && this.year == date.year) {
			return true;
		} else {
			return false;
		}
	}

	// implements Comparable interface
	// if calling object is earlier than the parameter passed in (user must guess later date), then -1 is returned
	// if calling object is later than the parameter passed in (user must guess earlier date), then 1 is returned
	public int compareTo(Date otherDate) {
		if (this.year < otherDate.year) {
			return -1;
		} else if(this.year > otherDate.year) {
			return 1;
		} else if (this.month < otherDate.month) {
			return -1;
		}else if (this.month > otherDate.month){
			return 1;
		} else if(this.day < otherDate.day){
			return -1;
		} else if(this.day > otherDate.day) {
			return 1;
		} else {
			// the dates are the same
			return 0;
			}
		}
	
	public String toString() {
		return day + ", " + month + ", " + year;
	}

}
