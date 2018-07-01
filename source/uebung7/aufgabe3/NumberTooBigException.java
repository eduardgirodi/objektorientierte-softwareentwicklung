package uebung7.aufgabe3;

public class NumberTooBigException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NumberTooBigException() {
		System.out.println("Number is too big!");
	}
}