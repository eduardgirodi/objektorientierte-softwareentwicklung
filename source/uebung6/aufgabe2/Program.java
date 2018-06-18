package uebung6.aufgabe2;

public class Program
{
	public static void main(String[] args)
	{
		Thread t = new Thread(new DateiBeobachter("\\home\\eduard\\Documents\\Test.txt"));
		t.start();
	}
}