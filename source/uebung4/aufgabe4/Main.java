package uebung4.aufgabe4;

public class Main {

    public static void main(String[] args) {
        Person[] x=new Person[3];
        x[0] = new Person("Peter","Hans",12345,"Mainstreet",3);
        x[1] = new Person("Peter","Hans",12345,"Mainstreet",6);
        x[2] = new Person("Pete","Hans",12345,"Mainstreet",5);

        Person min = (Person)Minimum.findMin(x);
        min.printPerson();

        int y[] = {1,2,3};
//        System.out.println((int)minimum.findMin(y));
    }
}