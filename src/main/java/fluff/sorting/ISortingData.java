package fluff.sorting;

public interface ISortingData<V> {
	
	V get(int index);
	
	void set(int index, V value);
	
	int size();
}
