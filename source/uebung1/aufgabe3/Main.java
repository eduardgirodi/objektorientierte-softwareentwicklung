package uebung1.aufgabe3;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eingabe: ");
        int k = scanner.nextInt(); // liest eine Ganzzahl (int) ein
        System.out.println(++k); // Ausgabe a)
        System.out.println(k); // Ausgabe b)
        System.out.println(k++); // Ausgabe c)

        int k2 = 5;
        double result = k2 / 2; // Stelle 1
        System.out.println("5 / 2 = " + result); // Ausgabe d)

        boolean b = false;
        if(b = false) {
            System.out.println("b ist falsch."); // Ausgabe e)
        }
        else {
            System.out.println("b ist wahr."); // Ausgabe f)
        }
    }
}