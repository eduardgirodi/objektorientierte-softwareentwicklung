package uebung8.aufgabe1;

public class Main {

	public static void main(String[] args) {
		//TierKaefig<Tier> kaefig = new TierKaefig<Katze>(); FEHLER
		
		/*
		 * Nicht kompilierbar, Typfehler Tier ungleich Katze, Tier Basisklasse von Katze,
		 * Typparameter kennen keine Vererbungshierarchie
		 */
		
		//TierKaefig<Hund> kaefig2 = new TierKaefig<Tier>(); FEHLER
		
		/*
		 * Nicht kompilierbar, Typfehler Hund ungleich Tier
		 */
		
		//TierKaefig<?> kaefig3 = new TierKaefig<Katze>();
		//kaefig3.setInsasse(new Katze()); FEHLER
		
		/*
		 * Nicht kompilierbar, Wildcard verwendet, fuer TierKaefig nicht explizit
		 * ein Typ spezifiziert wurde, somit nicht entscheidbar,
		 * ob setInsasse(Katze) stimmig ist => jeder Parameter muesste ein Subtyp von
		 * ? sein, nicht entscheidbar
		 */
		
		//TierKaefig kaefig4 = new TierKaefig(); WARNUNG
		//kaefig.setInsasse(new Hund());
		
		/*
		 * Kompilierbar mit Warnung wegen mangelnder Typsicherheit,
		 * TierKaefig sollte mit einem Typparameter versehen werden
		 */
	}
}