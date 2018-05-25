package uebung4.aufgabe1;

import java.util.Scanner;

public class Casino {

    public static void main(String[] args) {
        Spielemanager game = new Spielemanager(50);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen. Welches Spiel möchten Sie spielen?");
        System.out.println("Wahl 1: HochTief");
        System.out.println("Wahl 2: Funktionswerteraten");
        int spielWahl = scanner.nextInt();
        switch (spielWahl) {
            case 1: {     //HochTief
                Spiel ht = new HochTief();
                game.starteSpiel(ht);
                break;
            }
            case 2: {     //Funktionswerteraten
                Spiel fwr = new Funktionswerteraten();
                game.starteSpiel(fwr);
                break;
            }
            default:
                System.out.println("Fehlerhafte Eingabe. Es wurde kein Spiel gestartet.");
        }
    }
}