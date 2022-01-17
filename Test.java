package com.guessingGame;

public class Test {

	public static void main(String[] args) {
		Politician trudeau = new Politician("Justin Trudeau", new Date(25, 12, 1971), "Liberal");
		Singer dion = new Singer("Celine Dion", new Date(30, 3, 1961), "La voix du bon Dieu", new Date(6, 11, 1981));
		Singer robertson = new Singer("Ed Robertson", new Date(25, 10, 1970), "Gordon", new Date(7, 28, 1992));
		
		GuessMaster3 gm = new GuessMaster3();
		
		gm.addPerson(trudeau, 0.25);
		gm.addPerson(dion, 0.5);
		gm.addPerson(robertson, 0.75);
		
		System.out.println("There are " + gm.getPeople().size()+ " people in the game" );
		GuessablePerson<Politician> guessableTrudeau = new GuessablePerson<>(trudeau, 0.25);
		System.out.println("The next output should be -1" ); 
		System.out.println(guessableTrudeau.compareTo(dion)); 
		
		gm.startGame();
	}

}
