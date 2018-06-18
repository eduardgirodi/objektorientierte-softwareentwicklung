package online1;

public class Main {

    public static void main(String[] args) {
        Printer a = new Printer();
        Efunktion fkt = new Efunktion(0.25, 1.75);
        for(int i=0; i<3; i++) {
            a.druckeWertetabelle(fkt, -5, 5);
            a.druckeGraph(fkt, -5, 5);
            fkt = fkt.derivate();
        }
    }
}