package uebung1.aufgabe2.b;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Integer summand1 = scanner.nextInt();
        final Integer summand2 = scanner.nextInt();
        System.out.println(summand1 + summand2);
        scanner.close();
    }

}
