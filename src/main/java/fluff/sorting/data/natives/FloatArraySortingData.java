package fluff.sorting.data.natives;

import fluff.sorting.ISortingData;

public class FloatArraySortingData implements ISortingData<Float> {
	
	private final float[] array;
	
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
