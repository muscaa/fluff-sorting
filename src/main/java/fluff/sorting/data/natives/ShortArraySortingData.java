package fluff.sorting.data.natives;

import fluff.sorting.ISortingData;

public class ShortArraySortingData implements ISortingData<Short> {
	
	private final short[] array;
	
	public ShortArraySortingData(short[] array) {
		this.array = array;
	}
	
	@Override
	public Short get(int index) {
		return array[index];
	}
	
	@Override
	public void set(int index, Short value) {
		array[index] = value;
	}
	
	@Override
	public int size() {
		return array.length;
	}
}
