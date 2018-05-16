package uebung2.aufgabe4;

public class Schiff {

    private String name;
    private String kennzeichen;
    private Double laenge;

    public Schiff(String name, Double laenge) {
        this.name = name;
        this.laenge = laenge;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public void empfangeNachricht(String msg) {
        System.out.println("Empfangen von " + name + "/" + kennzeichen + ": " + msg);
    }
}