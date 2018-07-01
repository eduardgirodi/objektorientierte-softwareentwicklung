package uebung5.aufgabe1;

public class Angestellter {

    private String vorname;
    private String nachname;
    private int alter;
    private int gehalt;

    public Angestellter(String pVorname, String pNachname, int pAlter, int pGehalt) {
        this.vorname = pVorname;
        this.nachname = pNachname;
        this.alter = pAlter;
        this.gehalt = pGehalt;
    }

    public void erhoeheBetragUm(int pDelta) {
        this.gehalt += pDelta;
    }

    public void geburtstag() {
        this.alter++;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getAlter() {
        return alter;
    }

    public int getGehalt() {
        return gehalt;
    }
}