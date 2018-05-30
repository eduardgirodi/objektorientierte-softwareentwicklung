package uebung4.aufgabe1;

import java.util.Scanner;
import java.lang.Math;

public class Funktionswerteraten extends Spiel {

    private final static int MAXIMUM = 50;
    private final static int MAXDELTA = 5;

    public Funktionswerteraten(){
        super("Funktionswerteraten");
    }

    @Override
    public int spiele() {
        java.util.Random r = new java.util.Random();
        int function = r.nextInt(2);                                //Zufällige Funktion (0 oder 1)
        System.out.println("Ein Versuch: Schätzen des y-Wertes der folgenden Funktion.");
        int xValue = 0;
        int yValue = 0;
        IEvaluierbar temp = null;
        switch(function) {
            case 0: {                                                       //Efunktion
                xValue = r.nextInt(21)+1;                           //xValue zwischen 1 und 21 (inkl.)
                temp = new Efunktion();
                break;
            }
            case 1: {                                                       //LineareFunktion
                xValue = r.nextInt(MAXIMUM)+1;                              //xValue zwischen 1 und 50 (inkl.)
                temp = new LineareFunktion();
                break;
            }
        }
        yValue = temp.evaluate(xValue);
        System.out.println("x = "+xValue);
        System.out.println(temp.getName());
        System.out.println("(Tipp: y = " +yValue +")");

        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();                                      //Geschätzte Zahl wird eingelesen
        if(guess==yValue){                                                  //Schätzung gleicht y-Wert
            int gewinn = xValue+getEinsatz();
            System.out.println("Genau richtig! Sie gewinnen: " +gewinn);
            return gewinn;                                                  //return xValue+Einsatz
        }
        else if(Math.abs(yValue-guess)<MAXDELTA){                           //Schätzung gleicht ungefähr y-Wert
            int gewinn = xValue+getEinsatz();
            System.out.println("Ungefähr richtig! Sie gewinnen: " +gewinn);
            return gewinn;                                                  //return xValue+Einsatz
        }
        System.out.println("Falsch! Das Spiel behält Ihren Einsatz.");      //Schätzung gleicht nicht y-Wert
        return 0;                                                           //return 0, da verloren
    }
}