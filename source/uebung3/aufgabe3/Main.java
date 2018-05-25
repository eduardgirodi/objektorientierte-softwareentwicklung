package uebung3.aufgabe3;

public class Main {
	
	public static void main(String...args) {
		Stereoanlage s = new Stereoanlage();
		Playable pl = new CD();
		s.play(pl);
		pl= new Kassette();
		s.play(pl);
	}
}


/*
	Warum kommen unterschiedliche Ausgaben raus, obwohl Zeile 3 und 5 identisch sind?
		Antwort:	Weil in Zeile 2 und 4 die Methode mit verschiedenen *Parametern ?*
					aufgerufen wird einmal mit CD und einmal mit Kassette.
*/

