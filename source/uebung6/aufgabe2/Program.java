package uebung6.aufgabe2;

import java.io.File;

public class Program
{
	public static void main(String[] args)
	{
		Thread t = new Thread(new DateiBeobachter(File.separator +"home" +File.separator +"eduard" +File.separator +"Documents" +File.separator +"Test.txt"));
		t.start();
	}
}