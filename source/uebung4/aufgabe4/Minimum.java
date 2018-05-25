package uebung4.aufgabe4;

public class Minimum {
    public static Comparable findMin(Comparable[] x) {
        int min = 0;
        int i= 0;
        while(i<3) {
            if(x[min].compareTo(x[i])==1) {
                min=i;
            }
            i++;
        }
        return x[min];
    }
}