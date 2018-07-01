package online2;

public class Main {

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        GeoReihe g = new GeoReihe();

        Zahlen[] arr = new Zahlen[2];
        arr[0]= f;
        arr[1]= g;

        for (int i=0;i<2;i++) {
            arr[i].print();
        }
    }
}