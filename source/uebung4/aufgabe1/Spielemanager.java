package uebung4.aufgabe1;

import java.util.Scanner;

public class Spielemanager {

    private int kapital;

    public Spielemanager(int pKapital) {
        this.kapital = pKapital;
    }

    public void starteSpiel(Spiel sp) {
        System.out.println("Spiel wird gestartet. Ihr Kapital: " +this.getKapital());
        System.out.println("Bitte gewünschten Einsatz eingeben:");
        Scanner scanner = new Scanner(System.in);
        int einsatz = scanner.nextInt();
        if(einsatz <= this.getKapital() && einsatz > 0) {
            sp.setEinsatz(einsatz);
            this.setKapital(this.getKapital()-einsatz);
            int gewinn = sp.spiele();
            this.setKapital(this.getKapital()+gewinn);
            System.out.println("Neues Kapital: " +this.getKapital());
        }
        else System.out.println("Gewünschter Einsatz liegt im nicht akzeptablen Bereich.");
    }

    public int getKapital() { return this.kapital; }

    public void setKapital(int pKapital) { this.kapital = pKapital; }
}