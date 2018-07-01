package uebung5.aufgabe2;

public abstract class Koerper {
    private final String art;
    private final Punkt center;

    public Koerper(String art, Punkt center) {
        this.art = art;
        this.center = center;
    }

    public abstract double getVolume();

    public abstract void scale(int factor);

    public void moveX(int x) {
        center.setX(center.getX() + x);
    }

    public void moveY(int y) {
        center.setX(center.getY() + y);
    }

    public void moveZ(int z) {
        center.setX(center.getZ() + z);
    }

    public String getArt() {
        return art;
    }

    public Punkt getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return "Koerper{" +
                "art='" + art + '\'' +
                ", center=" + center +
                ", volume=" + getVolume() +
                '}';
    }
}
