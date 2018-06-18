package uebung5.aufgabe3;

public class Main {

    private static double[] testArray = {3.4, 1.5, 16.3, 6.4, 3.3};

    public static double[] selectionSort(double[] pArray) {
        double[] sorted = new double[pArray.length];

        if (pArray.length == 0 || pArray == null) {
            return sorted;
        }

        for(int i = 0; i < pArray.length; i++) {
            sorted[i] = pArray[i];
        }

        for(int oi = 0; oi < sorted.length; oi++) {             //oi outer index
            int min = oi;
            for(int ii = oi; ii < sorted.length; ii++) {        //ii inner index
                if(sorted[ii] < sorted[min]) {
                    min = ii;
                }
            }
            double tmp = sorted[oi];
            sorted[oi] = sorted[min];
            sorted[min] = tmp;
        }
        return sorted;
    }
    public static void main(String[] args) {
        double[] sortedTestArray = selectionSort(testArray);
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(sortedTestArray[i]);
        }
        System.out.println();
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
    }
}