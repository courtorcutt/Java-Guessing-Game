package com.guessingGame;

// Singer is a subclass of Person
public class Singer extends Person {
	private String debutAlbum; // immutable
	private Date debutAlbumReleaseDate; // mutable

	public Singer(String name, Date birthday, String debutAlbum, Date debutAlbumReleaseDate) {
		// initialize the parent class instance variables
		super(name, birthday);

		// initialize the other two instance variables specific to Singer
		this.debutAlbum = debutAlbum;
		this.debutAlbumReleaseDate = (Date) debutAlbumReleaseDate.clone();
	}

	// accessor methods for instance variables
	public String getDebutAlbum() {
		return this.debutAlbum;
	}

	public Date getDebutAlbumReleaseDate() {
		return (Date) debutAlbumReleaseDate.clone();
	}

	// mutator methods for instance variables
	public void setDebutAlbum(String debutAlbum) {
		this.debutAlbum = debutAlbum;
	}

	public void setDebutAlbumReleaseDate(Date debutAlbumReleaseDate) {
		this.debutAlbumReleaseDate = (Date) debutAlbumReleaseDate.clone();
	}

	// clone method that uses the better copy method and will return a Singer object
	public Singer clone() {
		Singer copy = (Singer) super.clone();
		copy.debutAlbumReleaseDate = (Date) debutAlbumReleaseDate.clone();
		return copy;
	}

	// overriding toString method with additional information specific to Singer object
	public String toString() {
		return (super.toString() + ". Their debut album was " + this.debutAlbum + " , and was released on "
				+ this.debutAlbumReleaseDate.getDay() + "/" + this.debutAlbumReleaseDate.getMonth() + "/"
				+ this.debutAlbumReleaseDate.getYear());
	}

	// return a string of what kind the object is
	public String personType() {
		return ("singer");
	}
}
