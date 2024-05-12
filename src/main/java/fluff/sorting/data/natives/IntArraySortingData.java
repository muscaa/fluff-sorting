package fluff.sorting.data.natives;

import fluff.sorting.ISortingData;

public class IntArraySortingData implements ISortingData<Integer> {
	
	private final int[] array;
	
	public IntArraySortingData(int[] array) {
		this.array = array;
	}
	
	@Override
	public Integer get(int index) {
		return array[index];
	}
	
	@Override
	public void set(int index, Integer value) {
		array[index] = value;
	}
	
	@Override
	public int size() {
		return array.length;
	}
}
