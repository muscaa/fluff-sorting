package fluff.sorting.data;

import fluff.sorting.ISortingData;

/**
 * Provides an implementation of the {@link ISortingData} interface for managing data using an array.
 *
 * @param <V> the type of elements in the array
 */
public class ArraySortingData<V> implements ISortingData<V> {
    
    private final V[] array;
    
    /**
     * Constructs a new ArraySortingData instance with the specified array.
     *
     * @param array the array to be used for sorting
     */
    public ArraySortingData(V[] array) {
        this.array = array;
    }
    
    @Override
    public V get(int index) {
        return array[index];
    }
    
    @Override
    public void set(int index, V value) {
        array[index] = value;
    }
    
    @Override
    public int size() {
        return array.length;
    }
    
    /**
     * Creates a temporary ArraySortingData instance with the specified size.
     * This method is useful for temporary storage during sorting operations.
     *
     * @param size the size of the array
     * @param <V> the type of elements in the array
     * @return a new ArraySortingData instance with the specified size
     */
    public static <V> ISortingData<V> temp(int size) {
        return new ArraySortingData<>((V[]) new Object[size]);
    }
}
