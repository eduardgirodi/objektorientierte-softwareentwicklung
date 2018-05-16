package uebung2.aufgabe3;

import java.util.Scanner;

public class Main {

    private static int gcd(int a, int b) {
        if (a==0) return b;
        while (b!=0) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eingabeparameter a>=0 eingeben:");
        int a = scanner.nextInt();
        System.out.println("Eingabeparameter b>=0 eingeben:");
        int b = scanner.nextInt();
        System.out.println("Größter gemeinsamer Teiler von " +a +" und " +b +" : " +gcd(a,b));
    }
}

/*
27 8
19 8
11 8
3 8
3 5
3 2
1 2
1 1
1 0
return 1
 */