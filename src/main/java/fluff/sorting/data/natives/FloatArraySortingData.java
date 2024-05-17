package fluff.sorting.data.natives;

import fluff.sorting.ISortingData;

/**
 * Represents sorting data for arrays of floats.
 */
public class FloatArraySortingData implements ISortingData<Float> {
	
	private final float[] array;
	
	/**
     * Constructs a new FloatArraySortingData instance with the specified float array.
     *
     * @param array the float array to be used for sorting
     */
	public FloatArraySortingData(float[] array) {
		this.array = array;
	}
	
	@Override
	public Float get(int index) {
		return array[index];
	}
	
	@Override
	public void set(int index, Float value) {
		array[index] = value;
	}
	
	@Override
	public int size() {
		return array.length;
	}
}
