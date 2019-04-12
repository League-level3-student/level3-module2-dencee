package _00_Sorting_Algorithms;

import java.util.Arrays;
import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	// Bogo sort is a joke sorting algorithm. It is considered the most
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.

	// It works by following these steps:
	// STEP 1. Is the array in order?
	// if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.

	// 1. Complete the sort method using the Bogo sort algorithm.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		Random rand = new Random();
		
		while( !checkSorted( array ) ) {
			int randomIndex1 = rand.nextInt(array.length - 1);
			int randomIndex2;
			
			do {
				randomIndex2 = rand.nextInt(array.length - 1);
			} while( randomIndex2 == randomIndex1 );

			System.out.println("swapping " + randomIndex1 + " and " + randomIndex2 );
			
			int temp = array[ randomIndex1 ];
			array[ randomIndex1 ] = array[ randomIndex2 ];
			array[ randomIndex2 ] = temp;
			
			display.updateDisplay();
		}
		
	}

	public boolean checkSorted(int[] array) {
		boolean sorted;

		if (array.length > 0) {
			sorted = true;
			for (int i = 1; i < array.length; i++) {
				if (array[i - 1] > array[i]) {
					sorted = false;
					break;
				}
			}
		} else {
			sorted = false;
		}
		
		return sorted;
	}
}
