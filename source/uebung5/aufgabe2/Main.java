package uebung5.aufgabe2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Koerper> koerperList = new ArrayList<>();
        koerperList.add(new Quader(new Punkt(1, 2, 3), 2, 4, 7));
        koerperList.add(new Kugel(new Punkt(2, 4, 6), 77));
        koerperList.forEach(System.out::println);
    }
}