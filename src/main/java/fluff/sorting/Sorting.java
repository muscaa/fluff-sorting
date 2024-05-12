package fluff.sorting;

import java.util.HashMap;
import java.util.Map;

import fluff.sorting.algorithms.MergeSortAlgorithm;
import fluff.sorting.algorithms.QuickSortAlgorithm;

public class Sorting {
	
	private static final Map<String, SortingFunctions> REG = new HashMap<>();
	
	public static final SortingFunctions QUICKSORT = register("quicksort", new QuickSortAlgorithm());
	public static final SortingFunctions MERGESORT = register("mergesort", new MergeSortAlgorithm());
	
	public static SortingFunctions get(String name) {
		return REG.get(name);
	}
	
	public static boolean has(String name) {
		return REG.containsKey(name);
	}
	
	public static SortingFunctions register(String name, ISortingAlgorithm algorithm) {
		SortingFunctions funcs = new SortingFunctions(algorithm);
		REG.put(name, funcs);
		return funcs;
	}
	
	public static boolean unregister(String name) {
		return REG.remove(name) != null;
	}
}
