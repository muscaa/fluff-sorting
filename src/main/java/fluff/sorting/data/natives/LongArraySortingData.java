package fluff.sorting.data.natives;

import fluff.sorting.ISortingData;

/**
 * Represents sorting data for arrays of longs.
 */
public class LongArraySortingData implements ISortingData<Long> {
	
	private final long[] array;
	
	/**
     * Constructs a new LongArraySortingData instance with the specified long array.
     *
     * @param array the long array to be used for sorting
     */
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
