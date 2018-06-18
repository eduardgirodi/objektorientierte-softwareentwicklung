package uebung6.aufgabe3;

import java.io.*;

public class Hamburger extends Fastfood {
	//void eat()
	//void eat() throws Exception
	//void eat(int y) throws Exception
	//void eat() throws FileNotFoundException
	void eat() throws RuntimeException {
		
	}
}

/*
 * Aufgabe 3
 * 
 * 1. Moeglich, da Hamburger.eat() die Methode Fastfood.eat() ueberschreibt
 * 2. Nicht moeglich, da eat nicht mit throws Exception deklariert
 *    werden darf, da Fastfood.eat() throws IOException existiert
 * 3. Moeglich, da die Methode eat ueberladen wurde mit dem
 *    Parameter int y
 * 4. Moeglich, da FileNotFoundException eine Unterklasse von
 *    IOException darstellt
 * 5. Moeglich, da IOException eine RuntimeException darstellt
 */