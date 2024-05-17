package fluff.sorting.data.natives;

import fluff.sorting.ISortingData;

/**
 * Represents sorting data for arrays of shorts.
 */
public class ShortArraySortingData implements ISortingData<Short> {
	
	private final short[] array;
	
	/**
     * Constructs a new ShortArraySortingData instance with the specified short array.
     *
     * @param array the short array to be used for sorting
     */
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
