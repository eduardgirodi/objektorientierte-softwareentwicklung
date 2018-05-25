package uebung4.aufgabe1;

public abstract class Spiel {
    private String name;
    private int einsatz;

    public abstract int spiele();

    public Spiel(String pName) { this.name=pName; }

    public String getName() {
        return this.name;
    }

    protected void setEinsatz(int pEinsatz) {
        this.einsatz = pEinsatz;
    }

    protected int getEinsatz() {
        return this.einsatz;
    }
}