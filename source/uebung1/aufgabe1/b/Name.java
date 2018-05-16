package uebung1.aufgabe1.b;

import static java.lang.Integer.parseInt;

public class Name {

    public static void main(String[] args) {
        final Integer operand1 = parseInt(args[0]);
        final Integer operand2 = parseInt(args[1]);
        final Integer choice = parseInt(args[2]);
        final Number result;
        switch (choice) {
            case 1:
                result = operand1 + operand2;
                System.out.println(operand1 + " + " + operand2 + " = " + result);
                break;
            case 2:
                result = operand1 - operand2;
                System.out.println(operand1 + " - " + operand2 + " = " + result);
                break;
            case 3:
                result = operand1 * operand2;
                System.out.println(operand1 + " * " + operand2 + " = " + result);
                break;
            case 4:
                result = operand1 / operand2;
                System.out.println(operand1 + " / " + operand2 + " = " + result);
                break;
            default:
                result = 0;
                System.out.println(result);
                break;
        }
    }

}
