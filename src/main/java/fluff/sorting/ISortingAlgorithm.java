package fluff.sorting;

import fluff.functions.gen.obj.obj.BooleanFunc2;

/**
 * Specifies the structure for sorting algorithms.
 */
public interface ISortingAlgorithm {
    
    /**
     * Sorts the provided data using the specified comparator.
     *
     * @param data       the data to be sorted
     * @param comparator the comparator function defining the sorting order
     * @param <V>        the type of data being sorted
     */
    <V> void sort(ISortingData<V> data, BooleanFunc2<V, V> comparator);
}
