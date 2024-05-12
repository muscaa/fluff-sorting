package fluff.sorting.data;

import java.util.List;

import fluff.sorting.ISortingData;

public class ListSortingData<V> implements ISortingData<V> {
	
	private final List<V> list;
	
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
