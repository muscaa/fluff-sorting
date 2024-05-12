package fluff.sorting.data.natives;

import fluff.sorting.ISortingData;

public class CharArraySortingData implements ISortingData<Character> {
	
	private final char[] array;
	
	public CharArraySortingData(char[] array) {
		this.array = array;
	}
	
	@Override
	public Character get(int index) {
		return array[index];
	}
	
	@Override
	public void set(int index, Character value) {
		array[index] = value;
	}
	
	@Override
	public int size() {
		return array.length;
	}
}
