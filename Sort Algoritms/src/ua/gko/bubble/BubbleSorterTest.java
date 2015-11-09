package ua.gko.bubble;

import java.util.Arrays;

public class BubbleSorterTest {
	public static void main(String[] args) {
		int[][] data = { {}, { 1 }, { 0, 2, 1 }, { 2, 3, 1, 0 }, { 0, 2, 1, 3, 5, 4, 6 }, };
		for (int[] arr : data) {
			System.out.print(Arrays.toString(arr) + " -> ");
			BubbleSorter.sort(arr);
			System.out.println(Arrays.toString(arr));
		}
	}
}