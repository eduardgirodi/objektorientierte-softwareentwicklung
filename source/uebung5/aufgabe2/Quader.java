package uebung5.aufgabe2;

public class Quader extends Koerper {
    private double xLength;
    private double yLength;
    private double zLength;


    public Quader(Punkt center, double xLength, double yLength, double zLength) {
        super("Quader", center);
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
    }

    @Override
    public double getVolume() {
        return xLength * yLength * zLength;
    }

    @Override
    public void scale(int factor) {
        xLength *= factor;
        yLength *= factor;
        zLength *= factor;
    }
}
