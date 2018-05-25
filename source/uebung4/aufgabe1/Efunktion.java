package uebung4.aufgabe1;

import java.lang.Math;

public class Efunktion implements IEvaluierbar {

    public String getName() {
        return "f(x) = e^x";
    }

    public int evaluate(int pX) {
        double result = Math.exp((double) pX);
        Long L = Math.round(result);
        return Integer.valueOf(L.intValue());
    }
}
