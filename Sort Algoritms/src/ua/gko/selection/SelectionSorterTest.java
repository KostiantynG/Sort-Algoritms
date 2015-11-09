package ua.gko.selection;

import java.util.Arrays;

public class SelectionSorterTest {
	public static void main(String[] args) {
		int[][] data = { {}, { 1 }, { 0, 2, 1 }, { 2, 3, 1, 0 }, { 0, 2, 1, 3, 5, 4, 6 }, };
		for (int[] arr : data) {
			System.out.print(Arrays.toString(arr) + " -> ");
			SelectionSorter.sort(arr);
			System.out.println(Arrays.toString(arr));
		}
	}
}
