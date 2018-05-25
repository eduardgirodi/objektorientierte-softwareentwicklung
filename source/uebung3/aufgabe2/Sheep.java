package uebung3.aufgabe2;

public class Sheep {

    public String name;
    public Fur fur;

    public Sheep(String name, Fur fur) {
        this.name = name;
        this.fur = fur;
    }

    public Sheep (Sheep original) {
        this.name = original.name;
        this.fur = new Fur(original.fur);
    }

    public void shear() {
        fur.length = 0;
    }

    public String toString() {
        return "Name: " + name + " " + fur.toString();
    }

    public Sheep clone() {
        return this;
    }

    public Sheep deepclone() {
        Sheep tmp = new Sheep(this);
        return tmp;
    }

    public Sheep shallowclone() {
        Sheep tmp = this;
        return tmp;
    }

    public boolean equals(Object compare) {
        boolean result = false;
        if(compare==null) return result;
        if(compare instanceof Sheep) {
            Sheep that = (Sheep) compare;
            if(this.name==that.name && this.fur.length==that.fur.length) {
                result = true;
            }
        }
        return result;
    }
}
