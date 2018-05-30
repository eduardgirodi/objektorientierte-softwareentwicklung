package uebung4.aufgabe3;

public class Main {

    public static void main(String[] args) {
        Cauliflower essen1 = new Cauliflower();
        Student.eat(essen1);                        //a) "I don't like Blumenkohl an Gorgonzolasoße"

        Spaghetti essen2 = new Spaghetti();
        Student.eat(essen2);                        //b) "I like Spaghetti Bologneser Art"

        Food essen = new Cauliflower();
        Student.eat(essen);                         //c) "I like Blumenkohl an Gorgonzolasoße
    }
}