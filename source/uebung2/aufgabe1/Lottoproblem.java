package uebung2.aufgabe1;

import java.util.Scanner;
import static uebung2.aufgabe1.Fakultät.factorial;
import static uebung2.aufgabe1.Biko.bico;

public class Lottoproblem {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eingabeparameter n>=0 eingeben:");
        long n = scanner.nextLong();
        System.out.println("Eingabeparameter k>=0 eingeben:");
        long k = scanner.nextLong();
        System.out.println("Ergebnis des modifizierten Lottoproblems: " +bico(n,k)*factorial(k));
    }
}
