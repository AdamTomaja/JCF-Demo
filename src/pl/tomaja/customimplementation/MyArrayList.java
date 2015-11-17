package pl.tomaja.customimplementation;

import java.util.AbstractList;

/**
 * This example class shows how to implement Your own collection. In this case unmodifiable List.
 * @author Adam Tomaja
 */
public class MyArrayList <T> extends AbstractList<T> {

	private final T[] array;
	
	public MyArrayList(T[] array) {
		this.array = array;
	}

	@Override
	public int size() {
		return array.length;
	}

	@Override
	public T get(int index) {
		return array[index];
	}
}
