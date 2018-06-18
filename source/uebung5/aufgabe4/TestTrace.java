package uebung5.aufgabe4;

public class TestTrace {
    public static void main(String[] args) {
        CallEg eg = new CallEg(); // use default constructor
        try {
            eg.methodA();
        } catch (ArithmeticException oops) {
            oops.printStackTrace();                             //Wird nicht ausgegeben, da Exception schon behandelt
        }
    }
}