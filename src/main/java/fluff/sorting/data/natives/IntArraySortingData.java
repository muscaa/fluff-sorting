package fluff.sorting.data.natives;

import fluff.sorting.ISortingData;

/**
 * Represents sorting data for arrays of ints.
 */
public class IntArraySortingData implements ISortingData<Integer> {
	
	private final int[] array;
	
	/**
     * Constructs a new IntArraySortingData instance with the specified int array.
     *
     * @param array the int array to be used for sorting
     */
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
