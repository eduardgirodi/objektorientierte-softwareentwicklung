package uebung6.aufgabe1;

public class ThreadTest {

	public static void main(String args[]){
		Thread t1 = new Thread(new DateCommand());
		t1.start();
		Thread t2 = new Thread(new CounterCommand());
		t2.start();
		}
}

/*
 * Aufgabe 1a
 *
 * 1. Unterklasse der Klasse Thread erstellen
 * 2. Interface Runnable implementieren
 *
 * 1. Vorteil: Es koennen Parameter ueber den Constructor
 *    der Unterklasse mitgegeben werden
 * 2. Vorteil: In Java ist nur einfache Vererbung moeglich,
 *    somit kann durch Implementierung von Runnable noch von
 *    einer Klasse geerbt werden, was im 1. Fall nicht moeglich
 *    ist
 */

/*
 * Aufgabe 1b
 * 
 * Geordnete Ausgabe der Schleifenwerte, da for-schleife extrem
 * klein (ebenso Datum)
 */

/*
 * Aufgabe 1c
 * 
 * Zufaellig angeordnete Ausgabe der Schleifenwerte und Datumswerte
 * aufgrund der zufaelligen Verzoegerungen der Threads
 */