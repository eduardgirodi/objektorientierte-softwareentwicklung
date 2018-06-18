package uebung5.aufgabe4;

class CallEg {

    public void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException oops) {
            oops.printStackTrace();                         //Wird nicht ausgegeben, da Exception schon behandelt
        }
    }

    public void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException oops) {
            oops.printStackTrace();                         //Wird nicht ausgegeben, da Exception schon behandelt
        }
    }

    public void methodC() throws ArithmeticException {
        try {
            int a = 1/0;
        } catch (ArithmeticException oops) {
            oops.printStackTrace();                         //Wird ausgegeben
        }
    }
}