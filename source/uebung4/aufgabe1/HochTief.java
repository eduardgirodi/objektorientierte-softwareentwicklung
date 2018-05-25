package uebung4.aufgabe1;

import java.util.Scanner;

public class HochTief extends Spiel {

    private final static int MAXIMUM = 100;
    private final static int TRIES = 5;

    public HochTief(){
        super("HochTief");
    }

    @Override
    public int spiele() {
        java.util.Random r = new java.util.Random();
        int rnd = r.nextInt(MAXIMUM+1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Erraten Sie eine Zahl zwischen 0 und " +MAXIMUM +" (Tipp: y = " +rnd +")");
        System.out.println("Sie haben insgesamt " +TRIES +" Versuche.");
        int counter = 0;
        int guess;
        do {
            guess = scanner.nextInt();
            if (guess == rnd) {
                System.out.println("Richtig! Sie bekommen das Doppelte Ihres Einsatzes zurück.");
                return this.getEinsatz()*2;
            }
            if (guess > rnd) {
                counter++;
                if(TRIES-counter == 1) {
                    System.out.println("Falsch. zu hoch. Sie haben noch einen Versuch.");
                }
                else if(TRIES-counter == 0) {
                    System.out.println("Falsch. zu hoch. Sie haben keine Versuche übrig.");
                }
                else {
                    System.out.println("Falsch. zu hoch. Sie haben noch " +(TRIES-counter) +" Versuche.");
                }
            }
            if (guess < rnd) {
                counter++;
                if(TRIES-counter == 1) {
                    System.out.println("Falsch. zu niedrig. Sie haben noch einen Versuch.");
                }
                else if(TRIES-counter == 0) {
                    System.out.println("Falsch. zu niedrig. Sie haben keine Versuche übrig.");
                }
                else {
                    System.out.println("Falsch. zu niedrig. Sie haben noch " +(TRIES-counter) +" Versuche.");
                }
            }
        } while(counter<TRIES);
        System.out.println("Alle Versuche ausgebraucht. Sie haben das Spiel und Ihren Einsatz verloren.");
        return 0;
    }
}
