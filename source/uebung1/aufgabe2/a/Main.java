package uebung1.aufgabe2.a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie heißen Sie?");
        String input = scanner.nextLine();
        System.out.println("Hallo " + input + "!");
        scanner.close();
    }

}
