package uebung1.aufgabe4;

public class Operatoren {
    public static void main(String[] args) {
        int a = 15;
        int b = 34;
        int c = 1;
        System.out.println("1: " + (a == b));
        System.out.println("2: " + (a == b - 19));
        System.out.println("3: " + (a ^ b));
        System.out.println("4: " + (a++ ^ b));
        System.out.println("5: " + (7 << ++c));
        System.out.println("6: " + (a = b = c = 0x10));
        System.out.println("7: " + (1e1));
    }

}
