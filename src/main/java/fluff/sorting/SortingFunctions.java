package fluff.sorting;

import java.util.List;

import fluff.functions.gen.obj.obj.BooleanFunc2;
import fluff.sorting.data.ArraySortingData;
import fluff.sorting.data.ListSortingData;
import fluff.sorting.data.natives.ByteArraySortingData;
import fluff.sorting.data.natives.CharArraySortingData;
import fluff.sorting.data.natives.DoubleArraySortingData;
import fluff.sorting.data.natives.FloatArraySortingData;
import fluff.sorting.data.natives.IntArraySortingData;
import fluff.sorting.data.natives.LongArraySortingData;
import fluff.sorting.data.natives.ShortArraySortingData;

public class SortingFunctions {
	
	private final ISortingAlgorithm algorithm;
	
	public SortingFunctions(ISortingAlgorithm algorithm) {
		this.algorithm = algorithm;
	}
	
	public <V> void data(ISortingData<V> data, BooleanFunc2<V, V> comparator) {
		algorithm.sort(data, comparator);
	}
	
	public <V> void list(List<V> list, BooleanFunc2<V, V> comparator) {
		data(new ListSortingData(list), comparator);
	}
	
	public <V> void array(V[] array, BooleanFunc2<V, V> comparator) {
		data(new ArraySortingData(array), comparator);
	}
	
	public <V> void array(byte[] array, BooleanFunc2<Byte, Byte> comparator) {
		data(new ByteArraySortingData(array), comparator);
	}
	
	public <V> void array(char[] array, BooleanFunc2<Character, Character> comparator) {
		data(new CharArraySortingData(array), comparator);
	}
	
	public <V> void array(short[] array, BooleanFunc2<Short, Short> comparator) {
		data(new ShortArraySortingData(array), comparator);
	}
	
	public <V> void array(int[] array, BooleanFunc2<Integer, Integer> comparator) {
		data(new IntArraySortingData(array), comparator);
	}
	
	public <V> void array(float[] array, BooleanFunc2<Float, Float> comparator) {
		data(new FloatArraySortingData(array), comparator);
	}
	
	public <V> void array(long[] array, BooleanFunc2<Long, Long> comparator) {
		data(new LongArraySortingData(array), comparator);
	}
	
	public <V> void array(double[] array, BooleanFunc2<Double, Double> comparator) {
		data(new DoubleArraySortingData(array), comparator);
	}
}
