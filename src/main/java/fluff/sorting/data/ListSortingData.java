package fluff.sorting.data;

import java.util.List;

import fluff.sorting.ISortingData;

/**
 * Provides an implementation of the {@link ISortingData} interface for managing data using a {@link List}.
 *
 * @param <V> the type of elements in the list
 */
public class ListSortingData<V> implements ISortingData<V> {
    
    private final List<V> list;
    
    /**
     * Constructs a new ListSortingData instance with the specified list.
     *
     * @param list the list to be used for sorting
     */
    public ListSortingData(List<V> list) {
        this.list = list;
    }
    
    @Override
    public V get(int index) {
        return list.get(index);
    }
    
    @Override
    public void set(int index, V value) {
        list.set(index, value);
    }
    
    @Override
    public int size() {
        return list.size();
    }
}
