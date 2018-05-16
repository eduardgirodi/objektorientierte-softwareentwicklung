package uebung2.aufgabe1;

import java.util.Scanner;

import static uebung2.aufgabe1.Fakultät.factorial;


public class Biko {

    public static long bico(long n, long k) {
        if (k < 0 || n < 0) System.out.println("Wrong parameters");
        if (n < k) return 0;
        else return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eingabeparameter n>=0 eingeben:");
        long n = scanner.nextLong();
        System.out.println("Eingabeparameter k>=0 eingeben:");
        long k = scanner.nextLong();
        System.out.println("n über k mit n=" + n + " und k=" + k + " = " + bico(n, k));
    }
}
