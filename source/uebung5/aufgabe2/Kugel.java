package uebung5.aufgabe2;

public class Kugel extends Koerper {
    private double radius;

    public Kugel(Punkt center, double radius) {
        super("Kugel", center);
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public void scale(int factor) {
        radius *= factor;
    }
}
