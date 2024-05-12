package fluff.sorting.data.natives;

import fluff.sorting.ISortingData;

public class ByteArraySortingData implements ISortingData<Byte> {
	
	private final byte[] array;
	
	public ByteArraySortingData(byte[] array) {
		this.array = array;
	}
	
	@Override
	public Byte get(int index) {
		return array[index];
	}
	
	@Override
	public void set(int index, Byte value) {
		array[index] = value;
	}
	
	@Override
	public int size() {
		return array.length;
	}
}
