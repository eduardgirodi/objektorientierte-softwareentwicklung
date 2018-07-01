package uebung5.aufgabe1;

public class Praktikant extends Angestellter {

    private static final int GEHALT = 400;

    public Praktikant(String pVorname, String pNachname, int pAlter) {
        super(pVorname, pNachname, pAlter, GEHALT);
    }
}