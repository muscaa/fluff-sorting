package fluff.sorting.data.natives;

import fluff.sorting.ISortingData;

public class DoubleArraySortingData implements ISortingData<Double> {
	
	private final double[] array;
	
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
