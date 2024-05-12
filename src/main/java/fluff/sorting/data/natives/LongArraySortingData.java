package fluff.sorting.data.natives;

import fluff.sorting.ISortingData;

public class LongArraySortingData implements ISortingData<Long> {
	
	private final long[] array;
	
	public LongArraySortingData(long[] array) {
		this.array = array;
	}
	
	@Override
	public Long get(int index) {
		return array[index];
	}
	
	@Override
	public void set(int index, Long value) {
		array[index] = value;
	}
	
	@Override
	public int size() {
		return array.length;
	}
}
