package fluff.sorting;

import java.util.HashMap;
import java.util.Map;

import fluff.sorting.algorithms.MergeSortAlgorithm;
import fluff.sorting.algorithms.QuickSortAlgorithm;

/**
 * Provides access to various sorting algorithms and their associated functions.
 */
public class Sorting {
    
    private static final Map<String, SortingFunctions> REG = new HashMap<>();
    
    /** Represents the QuickSort sorting algorithm. */
    public static final SortingFunctions QUICKSORT = register("quicksort", new QuickSortAlgorithm());
    
    /** Represents the MergeSort sorting algorithm. */
    public static final SortingFunctions MERGESORT = register("mergesort", new MergeSortAlgorithm());
    
    /**
     * Retrieves the sorting functions associated with the specified algorithm name.
     *
     * @param name the name of the sorting algorithm
     * @return the sorting functions associated with the specified algorithm name, or null if not found
     */
    public static SortingFunctions get(String name) {
        return REG.get(name);
    }
    
    /**
     * Checks if a sorting algorithm with the specified name is registered.
     *
     * @param name the name of the sorting algorithm
     * @return true if a sorting algorithm with the specified name is registered, otherwise false
     */
    public static boolean has(String name) {
        return REG.containsKey(name);
    }
    
    /**
     * Registers a new sorting algorithm with the specified name.
     *
     * @param name the name of the sorting algorithm
     * @param algorithm the sorting algorithm to register
     * @return the sorting functions associated with the registered algorithm
     */
    public static SortingFunctions register(String name, ISortingAlgorithm algorithm) {
        SortingFunctions funcs = new SortingFunctions(algorithm);
        REG.put(name, funcs);
        return funcs;
    }
    
    /**
     * Unregisters the sorting algorithm with the specified name.
     *
     * @param name the name of the sorting algorithm to unregister
     * @return true if the sorting algorithm was successfully unregistered, otherwise false
     */
    public static boolean unregister(String name) {
        return REG.remove(name) != null;
    }
}
