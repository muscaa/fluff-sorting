package fluff.sorting.algorithms;

import fluff.functions.gen.obj.obj.BooleanFunc2;
import fluff.sorting.ISortingAlgorithm;
import fluff.sorting.ISortingData;

public class QuickSortAlgorithm implements ISortingAlgorithm {
	
	@Override
	public <V> void sort(ISortingData<V> data, BooleanFunc2<V, V> comparator) {
		sort(data, comparator, 0, data.size() - 1);
	}
	
	private <V> void sort(ISortingData<V> data, BooleanFunc2<V, V> comparator, int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(data, comparator, begin, end);
			
			sort(data, comparator, begin, partitionIndex - 1);
			sort(data, comparator, partitionIndex + 1, end);
		}
	}
	
	private <V> int partition(ISortingData<V> data, BooleanFunc2<V, V> comparator, int begin, int end) {
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
