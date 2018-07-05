package uebung7.aufgabe3;

public class Main {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int userInput = 0;
		System.out.println("Enter integer:");
		try {
			userInput = sc.nextInt();
		}
		catch (Exception ex) {
			
		}
		if (userInput > 5) {
			throw new NumberTooBigException();
		}
		try {
			checkIfTooSmall(userInput);
		}
		catch (NumberTooSmallException x) {
			
		}
		
		/*
		 * Unterklassen von RuntimeException stellen ungepruefte Exceptions dar
		 * => Bugs, Logikfehler
		 * => sollten gefixt werden und nicht mit try / catch Bloecken abgefangen
		 *    werden (= schlechter Stil)
		 * 
		 * Unterklassen von Exception stellen gepruefte Exceptions dar
		 * => Fehler, die waehrend der Programmausfuehrung auftreten koennen
		 * => sollten mit try / catch Bloecken abgefangen werden oder
		 *    mit dem Kennwort throws weitergegeben werden
		 *    
		 * 
		 * 
		 * => Exceptions werden von Eclipse verschieden angezeigt (weiterer
		 *    Hinweis darauf, dass RuntimeExceptions vom Programmierer gefixt
		 *    werden sollten)
		 * 
		 *  Number is too big!
			Exception in thread "main" NumberTooBigException
			at Main.main(Main.java:20)

			Number is too small!
		 */
	}
	
	public static void checkIfTooSmall(int value) throws NumberTooSmallException {
		if (value < 5) {
			throw new NumberTooSmallException();
		}
	}
}