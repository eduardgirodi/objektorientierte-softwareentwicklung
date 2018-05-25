package uebung4.aufgabe1;

import java.lang.Math;

public class LineareFunktion implements IEvaluierbar {

    private final static int m = 7;
    private final static int b = 3;

    public int evaluate(int pX) {
        return m*pX+b;
    }

    public String getName() {
        return "f(x) = "+m+" * x + "+b;
    }
}