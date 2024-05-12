package fluff.sorting;

import java.util.List;

import fluff.functions.gen.obj.obj.BooleanFunc2;
import fluff.sorting.data.ArraySortingData;
import fluff.sorting.data.ListSortingData;

public class SortingFunctions {
	
	private final ISortingAlgorithm algorithm;
	
	public SortingFunctions(ISortingAlgorithm algorithm) {
		this.algorithm = algorithm;
	}
	
	public <V> void data(ISortingData<V> data, BooleanFunc2<V, V> comparator) {
		algorithm.sort(data, comparator);
	}
	
	public <V> void array(V[] array, BooleanFunc2<V, V> comparator) {
		data(new ArraySortingData(array), comparator);
	}
	
	public <V> void list(List<V> list, BooleanFunc2<V, V> comparator) {
		data(new ListSortingData(list), comparator);
	}
}
