package uebung8.aufgabe1;

public class TierKaefig<E> {
	private E insasse;
	
	public void setInsasse(E x)
	{
		insasse = x;
	}
	
	public E getInsasse()
	{
		return insasse;
	}
}