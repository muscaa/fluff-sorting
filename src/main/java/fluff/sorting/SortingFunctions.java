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

/**
 * Provides utility methods for sorting data using different sorting algorithms.
 */
public class SortingFunctions {
    
    private final ISortingAlgorithm algorithm;
    
    /**
     * Constructs a SortingFunctions instance with the specified sorting algorithm.
     *
     * @param algorithm the sorting algorithm to be used
     */
    public SortingFunctions(ISortingAlgorithm algorithm) {
        this.algorithm = algorithm;
    }
    
    /**
     * Sorts the provided data using the specified comparator function.
     *
     * @param data the data to be sorted
     * @param comparator the comparator function used for sorting
     * @param <V> the type of elements in the data
     */
    public <V> void data(ISortingData<V> data, BooleanFunc2<V, V> comparator) {
        algorithm.sort(data, comparator);
    }
    
    /**
     * Sorts the elements in the provided list using the specified comparator function.
     *
     * @param list the list to be sorted
     * @param comparator the comparator function used for sorting
     * @param <V> the type of elements in the list
     */
    public <V> void list(List<V> list, BooleanFunc2<V, V> comparator) {
        data(new ListSortingData<>(list), comparator);
    }
    
    /**
     * Sorts the elements in the provided array using the specified comparator function.
     *
     * @param array the array to be sorted
     * @param comparator the comparator function used for sorting
     * @param <V> the type of elements in the array
     */
    public <V> void array(V[] array, BooleanFunc2<V, V> comparator) {
        data(new ArraySortingData<>(array), comparator);
    }
    
    /**
     * Sorts the elements in the provided byte array using the specified comparator function.
     *
     * @param array the byte array to be sorted
     * @param comparator the comparator function used for sorting
     */
    public void array(byte[] array, BooleanFunc2<Byte, Byte> comparator) {
        data(new ByteArraySortingData(array), comparator);
    }
	
    /**
     * Sorts the elements in the provided char array using the specified comparator function.
     *
     * @param array the char array to be sorted
     * @param comparator the comparator function used for sorting
     */
	public void array(char[] array, BooleanFunc2<Character, Character> comparator) {
		data(new CharArraySortingData(array), comparator);
	}
	
	/**
     * Sorts the elements in the provided short array using the specified comparator function.
     *
     * @param array the short array to be sorted
     * @param comparator the comparator function used for sorting
     */
	public void array(short[] array, BooleanFunc2<Short, Short> comparator) {
		data(new ShortArraySortingData(array), comparator);
	}
	
	/**
     * Sorts the elements in the provided int array using the specified comparator function.
     *
     * @param array the int array to be sorted
     * @param comparator the comparator function used for sorting
     */
	public void array(int[] array, BooleanFunc2<Integer, Integer> comparator) {
		data(new IntArraySortingData(array), comparator);
	}
	
	/**
     * Sorts the elements in the provided float array using the specified comparator function.
     *
     * @param array the float array to be sorted
     * @param comparator the comparator function used for sorting
     */
	public void array(float[] array, BooleanFunc2<Float, Float> comparator) {
		data(new FloatArraySortingData(array), comparator);
	}
	
	/**
     * Sorts the elements in the provided long array using the specified comparator function.
     *
     * @param array the long array to be sorted
     * @param comparator the comparator function used for sorting
     */
	public void array(long[] array, BooleanFunc2<Long, Long> comparator) {
		data(new LongArraySortingData(array), comparator);
	}
	
	/**
     * Sorts the elements in the provided double array using the specified comparator function.
     *
     * @param array the double array to be sorted
     * @param comparator the comparator function used for sorting
     */
	public void array(double[] array, BooleanFunc2<Double, Double> comparator) {
		data(new DoubleArraySortingData(array), comparator);
	}
}
