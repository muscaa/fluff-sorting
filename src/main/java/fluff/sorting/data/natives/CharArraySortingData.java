package fluff.sorting.data.natives;

import fluff.sorting.ISortingData;

/**
 * Represents sorting data for arrays of chars.
 */
public class CharArraySortingData implements ISortingData<Character> {
	
	private final char[] array;
	
	/**
     * Constructs a new CharArraySortingData instance with the specified char array.
     *
     * @param array the char array to be used for sorting
     */
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
