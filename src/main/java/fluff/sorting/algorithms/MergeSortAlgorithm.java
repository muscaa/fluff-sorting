package fluff.sorting.algorithms;

import fluff.functions.gen.obj.obj.BooleanFunc2;
import fluff.sorting.ISortingAlgorithm;
import fluff.sorting.ISortingData;
import fluff.sorting.data.ArraySortingData;

public class MergeSortAlgorithm implements ISortingAlgorithm {
	
	@Override
	public <V> void sort(ISortingData<V> data, BooleanFunc2<V, V> comparator) {
	    if (data.size() < 2) return;
	    
	    int mid = data.size() / 2;
	    ISortingData<V> left = ArraySortingData.temp(mid);
	    ISortingData<V> right = ArraySortingData.temp(data.size() - mid);
	    
	    for (int i = 0; i < mid; i++) {
	    	left.set(i, data.get(i));
	    }
	    for (int i = mid; i < data.size(); i++) {
	    	right.set(i - mid, data.get(i));
	    }
	    
	    sort(left, comparator);
	    sort(right, comparator);
	    
	    merge(data, comparator, left, right);
	}
	
	public <V> void merge(ISortingData<V> data, BooleanFunc2<V, V> comparator, ISortingData<V> left, ISortingData<V> right) {
		int i = 0, j = 0, k = 0;
		while (i < left.size() && j < right.size()) {
			if (comparator.invoke(left.get(i), right.get(j))) {
				data.set(k++, left.get(i++));
			} else {
				data.set(k++, right.get(j++));
			}
		}
		while (i < left.size()) {
			data.set(k++, left.get(i++));
		}
		while (j < right.size()) {
			data.set(k++, right.get(j++));
		}
	}
}
