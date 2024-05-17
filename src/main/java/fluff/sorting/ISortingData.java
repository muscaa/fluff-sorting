package fluff.sorting;

/**
 * Defines the structure for managing data to be sorted.
 *
 * @param <V> the type of data elements to be sorted
 */
public interface ISortingData<V> {
    
    /**
     * Retrieves the element at the specified index.
     *
     * @param index the index of the element to retrieve
     * @return the element at the specified index
     */
    V get(int index);
    
    /**
     * Sets the element at the specified index to the given value.
     *
     * @param index the index of the element to set
     * @param value the value to set
     */
    void set(int index, V value);
    
    /**
     * Returns the number of elements in the data structure.
     *
     * @return the number of elements
     */
    int size();
}
