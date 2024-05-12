package fluff.sorting;

import fluff.functions.gen.obj.obj.BooleanFunc2;

public interface ISortingAlgorithm {
	
	<V> void sort(ISortingData<V> data, BooleanFunc2<V, V> comparator);
}
