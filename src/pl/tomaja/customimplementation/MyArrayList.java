package pl.tomaja.customimplementation;

import java.util.AbstractList;

/**
 * This example class shows how to implement Your own collection. In this case unmodifiable List.
 * 
 * Other abstract classes we can inherit: 
 * <ul>
 *		<li>AbstractCollection</li>
 *		<li>AbstractSet</li>
 *		<li>AbstractList</li>
 *		<li>AbstractSequentialList</li>
 *		<li>AbstractQueue</li>
 *		<li>AbstractMap</li>
 * </ul>
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
