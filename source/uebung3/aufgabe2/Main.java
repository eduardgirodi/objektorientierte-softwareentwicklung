package uebung3.aufgabe2;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aufgabenteil a), b) oder c)?");
        char exercise = scanner.nextLine().charAt(0);
        switch (exercise) {
            case 'a': {     //Aufgabenteil a)
                Sheep origin = new Sheep("Arnold", new Fur(10));
                Sheep clone = origin.clone();
                System.out.println("1: " + origin.toString());
                System.out.println("2: " + clone.toString());
                System.out.println();
                clone.shear();
                clone.name = "Lel";
                System.out.println("1: " + origin.toString());
                System.out.println("2: " + clone.toString());
                break;
            }
            case 'b': {     //Aufgabenteil b)
                Sheep origin = new Sheep("Arnold", new Fur(10));
                Sheep shallowSheep = origin.shallowclone();
                Sheep deepSheep = origin.deepclone();
                System.out.println("Origin: " + origin.toString());
                System.out.println("Shallow cloned sheep: " + shallowSheep.toString());
                System.out.println("Deep cloned sheep: " + deepSheep.toString());
                System.out.println();
                shallowSheep.shear();
//                deepSheep.shear();
                shallowSheep.name = "Lel";
                deepSheep.name = "Lol";
                System.out.println("Origin: " + origin.toString());
                System.out.println("Shallow cloned sheep: " + shallowSheep.toString());
                System.out.println("Deep cloned sheep: " + deepSheep.toString());
                break;
            }
            case 'c': {     //Aufgabenteil c)
                Sheep origin = new Sheep("Arnold", new Fur(10));
                Sheep shallowSheep = origin.shallowclone();
                Sheep deepSheep = origin.deepclone();
                System.out.println("Origin: " + origin.toString());
                System.out.println("Shallow cloned sheep: " + shallowSheep.toString());
                System.out.println("Deep cloned sheep: " + deepSheep.toString());
                System.out.println();
                shallowSheep.shear();
//                deepSheep.shear();
                shallowSheep.name = "Lel";
                deepSheep.name = "Lol";
                System.out.println("Origin: " + origin.toString());
                System.out.println("Shallow cloned sheep: " + shallowSheep.toString());
                System.out.println("Deep cloned sheep: " + deepSheep.toString());
                System.out.println();
                System.out.println("Origin equals shallow clone: " +origin.equals(shallowSheep));
                System.out.println("Origin equals deep clone: " +origin.equals(deepSheep));
                break;
            }
            default:    System.out.println("Fehlerhafte Eingabe.");
                break;
        }
    }
}