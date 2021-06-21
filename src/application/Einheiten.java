package application;

import java.util.Arrays;

public class Einheiten {

	public static void main(String[] args) {
		Quicksort q = new Quicksort();
		int[] sortierenArray = {2, 6, 8, 1, 2, 9};
		System.out.println(Arrays.toString(sortierenArray));
		q.quicksort(sortierenArray, 0, 5);
		System.out.println(Arrays.toString(sortierenArray));
		
		int[] sortierenArray2 = {2, 6, 4, 67, 1, 7, 324};
		Selectionsort.selectionsort(sortierenArray2);
		System.out.println(Arrays.toString(sortierenArray2));
	}
}
