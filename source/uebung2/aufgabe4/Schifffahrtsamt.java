package uebung2.aufgabe4;

import uebung2.aufgabe4.Schiff;

public class Schifffahrtsamt {

    private final static int SCHIFFE_SIZE = 50;

    private Schiff[] schiffe;

    public Schifffahrtsamt() {
        schiffe = new Schiff[SCHIFFE_SIZE];
    }

    public void meldung(String nachricht, int dringlichkeit) {
        if (dringlichkeit == 1) {
            for (Schiff schiff : schiffe) {
                if (schiff != null) schiff.empfangeNachricht(nachricht);
            }
        }
    }

    public void registriereSchiff(Schiff schiff) {
        int i = 0;
        while (schiffe[i] != null && i < SCHIFFE_SIZE) {
            i++;
        }
        schiffe[i] = schiff;
    }

    public static String getKennzeichen() {
        java.util.Random rnd = new java.util.Random();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 6; i++) {
            sb.append((char)((rnd.nextInt(25)+65)));
        }
        return sb.toString();
    }
}