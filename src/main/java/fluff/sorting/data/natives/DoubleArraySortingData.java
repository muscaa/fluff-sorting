package fluff.sorting.data.natives;

import fluff.sorting.ISortingData;

/**
 * Represents sorting data for arrays of doubles.
 */
public class DoubleArraySortingData implements ISortingData<Double> {
	
	private final double[] array;
	
	/**
     * Constructs a new DoubleArraySortingData instance with the specified double array.
     *
     * @param array the double array to be used for sorting
     */
	public DoubleArraySortingData(double[] array) {
		this.array = array;
	}
	
	@Override
	public Double get(int index) {
		return array[index];
	}
	
	@Override
	public void set(int index, Double value) {
		array[index] = value;
	}
	
	@Override
	public int size() {
		return array.length;
	}
}
