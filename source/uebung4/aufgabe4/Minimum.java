package uebung4.aufgabe4;

public class Minimum {
    public static Comparable findMin(Comparable[] x) {
        int min = 0;
        for(int i = 0; i<x.length; i++) {
            if(x[min].compareTo(x[i])==1) {
                min=i;
            }
        }
        return x[min];
    }
}