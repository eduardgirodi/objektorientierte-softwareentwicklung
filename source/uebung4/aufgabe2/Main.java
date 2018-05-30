package uebung4.aufgabe2;

public class Main {

    public static void main(String[] args) {
        Auto auto1 = new Lastwagen();
        System.out.println(auto1.reifen);                       //Ausgabe 1)
        System.out.println(((Lastwagen) auto1).reifen);         //Ausgabe 2)
        System.out.println(auto1.getReifen());                  //Ausgabe 3)
        System.out.println(((Lastwagen) auto1).getReifen());    //Ausgabe 4)
    }
}

/*  a)
        4
        8
        8
        8

    b)      (getReifen()-Methode  aus  der  Klasse Lastwagen entfernt)
        4
        8
        4
        4

    c)      (getReifen()-Methode aus der Klasse Auto entfernt)
        4
        8
        (keine Ausgabe möglich)
        8
*/