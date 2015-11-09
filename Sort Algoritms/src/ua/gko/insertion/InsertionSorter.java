package ua.gko.insertion;

public class InsertionSorter {
	public static void sort(int[] arr) {
		for (int k = 1; k < arr.length; k++) {
			int newElement = arr[k];
			int location = k - 1;
			while (location >= 0 && arr[location] > newElement) {
				arr[location + 1] = arr[location];
				location--;
			}
			arr[location + 1] = newElement;
		}
	}
}
