package uebung4.aufgabe3;

public class Student {
    public static void eat(Food food) {
        System.out.println("I like " +food.getMeal());
    }
    public static void eat(Cauliflower Cauliflower) {
        System.out.println("I don't like " +Cauliflower.getMeal());
    }
}