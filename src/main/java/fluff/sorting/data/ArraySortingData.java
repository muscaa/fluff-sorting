package fluff.sorting.data;

import fluff.sorting.ISortingData;

public class ArraySortingData<V> implements ISortingData<V> {
	
	private final V[] array;
	
	public ArraySortingData(V[] array) {
		this.array = array;
	}
	
	@Override
	public V get(int index) {
		return array[index];
	}
	
	@Override
	public void set(int index, V value) {
		array[index] = value;
	}
	
	@Override
	public int size() {
		return array.length;
	}
}
