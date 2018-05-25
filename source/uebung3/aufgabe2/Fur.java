package uebung3.aufgabe2;

public class Fur {

    public int length;

    public Fur(int length) {
        this.length = length;
    }

    public Fur(Fur original) { this.length = original.length; }

    public String toString() {
        return "Felllaenge: " + length;
    }
}
