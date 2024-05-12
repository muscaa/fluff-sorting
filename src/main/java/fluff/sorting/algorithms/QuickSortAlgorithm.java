package fluff.sorting.algorithms;

import fluff.functions.gen.obj.obj.BooleanFunc2;
import fluff.sorting.ISortingAlgorithm;
import fluff.sorting.ISortingData;

public class QuickSortAlgorithm implements ISortingAlgorithm {
	
	@Override
	public <V> void sort(ISortingData<V> data, BooleanFunc2<V, V> comparator) {
		sort(data, 0, data.size() - 1, comparator);
	}
	
	private static <V> void sort(ISortingData<V> data, int begin, int end, BooleanFunc2<V, V> comparator) {
		if (begin < end) {
			int partitionIndex = partition(data, begin, end, comparator);
			
			sort(data, begin, partitionIndex - 1, comparator);
			sort(data, partitionIndex + 1, end, comparator);
		}
	}
	
	private static <V> int partition(ISortingData<V> data, int begin, int end, BooleanFunc2<V, V> comparator) {
		V pivot = data.get(end);
		int i = (begin - 1);
		
		for (int j = begin; j < end; j++) {
			if (comparator.invoke(data.get(j), pivot)) {
				i++;
				
				V swapTemp = data.get(i);
				data.set(i, data.get(j));
				data.set(j, swapTemp);
			}
		}
		
		V swapTemp = data.get(i + 1);
		data.set(i + 1, data.get(end));
		data.set(end, swapTemp);
		
		return i + 1;
	}
}
