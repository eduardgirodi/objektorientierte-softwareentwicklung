package uebung6.aufgabe1;

public class CounterCommand implements Runnable {
	@Override
	public void run() {
		java.util.Random r = new java.util.Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try	{
				Thread.sleep(r.nextInt(1000));
			}
			catch (InterruptedException ex)	{

			}
		}
	}
}