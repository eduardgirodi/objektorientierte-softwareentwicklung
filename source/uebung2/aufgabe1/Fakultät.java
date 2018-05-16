package uebung2.aufgabe1;

import java.util.Scanner;

public class Fakultät {

    public static long factorial(long n) {
        long result;
        if(n==0 || n==1){
            return 1;
        }
        result = n * factorial(n-1);
        return result;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eingabeparameter n>=0 eingeben:");
        long n = scanner.nextLong();
    }
}
