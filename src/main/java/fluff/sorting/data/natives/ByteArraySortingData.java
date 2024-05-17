package fluff.sorting.data.natives;

import fluff.sorting.ISortingData;

/**
 * Represents sorting data for arrays of bytes.
 */
public class ByteArraySortingData implements ISortingData<Byte> {
    
    private final byte[] array;
    
    /**
     * Constructs a new ByteArraySortingData instance with the specified byte array.
     *
     * @param array the byte array to be used for sorting
     */
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
