package online1;

public class Efunktion implements Funktion {

    public double a;
    public double b;

    public Efunktion(double pA, double pB) {
        this.a = pA;
        this.b = pB;
    }

    public double evaluate(double pX) {
        return a*Math.pow(Math.E, b*pX);
    }

    @Override
    public Efunktion derivate(){
        return new Efunktion(this.a*this.b, this.b);
    }
}