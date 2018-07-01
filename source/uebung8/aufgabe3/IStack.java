package uebung8.aufgabe3;

import java.util.List;

public interface IStack<T> extends List<T> {
	public T pop();
	public void push(T element);
}