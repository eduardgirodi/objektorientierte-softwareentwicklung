package online2;

public class Fibonacci extends Thread implements Zahlen {

    public void print() {
        this.start();
    }

    public void run() {
        int f1 = 0;
        int f2 = 1;

        for(int i=0; i<40; i++) {
            System.out.println("FIBO: " +f2);
            if(i > 0) System.out.println("GOLD: " +(double)f2/f1);
            f2 += f1;
            f1 = f2 - f1;
        }
    }
}
