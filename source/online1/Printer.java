package online1;

public class Printer {

    public void druckeWertetabelle(Funktion f, int a, int b) {
        System.out.println("Tabelle:");
        for (int x = a; x <= b; x++)
            System.out.println(x + ": " + f.evaluate(x));
    }

    public void druckeGraph(Funktion f, int a, int b) {
        System.out.println("Graph:");
        for (int x = a; x <= b; x++) {
            System.out.print(x);
            for (int i = 0; i <= f.evaluate(x); i++)
                System.out.print(" ");
            System.out.println("0");
        }
    }
}