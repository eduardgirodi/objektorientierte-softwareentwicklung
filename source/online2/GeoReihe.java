package online2;

public class GeoReihe implements Runnable, Zahlen{

    public void print() {
        Thread t = new Thread(this);
        t.start();

    }

    double geo(double pN) {
        double erg=0;
        for(int i=0; i<pN; i++) {
            erg += Math.pow(0.5, i);

        }
        return erg;
    }

    public void run() {
        for(double i=0; i<=40; i++)
            System.out.println("GEO: "+ geo(i));
    }
}