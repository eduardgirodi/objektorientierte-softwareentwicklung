package uebung3.aufgabe2;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aufgabenteil a), b) oder c)?");
        char exercise = scanner.nextLine().charAt(0);
        switch (exercise) {
            case 'a':
                Sheep sh = new Sheep("Arnold", new Fur(10));
                Sheep clone = sh.clone();
                System.out.println("1: " +sh.toString());
                System.out.println("2: " +clone.toString());
                System.out.println();
                clone.shear();
                clone.name="Lel";
                System.out.println("1: " +sh.toString());
                System.out.println("2: " +clone.toString());
                break;
            case 'b':

                break;
            case 'c':
                break;
            default:    System.out.println("Fehlerhafte Eingabe.");
                break;
        }
    }
}