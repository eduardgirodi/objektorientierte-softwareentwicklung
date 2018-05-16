package uebung2.aufgabe4;

import uebung2.aufgabe4.Schiff;
import uebung2.aufgabe4.Schifffahrtsamt;

public class Werft {

    public void produziereSchiff(String name, Double laenge, Schifffahrtsamt amt) {
        final String kennzeichen = Schifffahrtsamt.getKennzeichen();
        final Schiff schiff = new Schiff(name, laenge);
        schiff.setKennzeichen(kennzeichen);
        amt.registriereSchiff(schiff);
    }

}