package sorting;

public class BubbleSort {

	// bubble sort in O(n2)
	void bubbleSort(int arr[]) {
		int size = arr.length;
		for (int pass = size - 1; pass >= 0; pass--) {
			for (int j = 0; j < pass; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap elements
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	// bubble sort, best case in O(n)
	void bubbleSortImproved(int arr[]) {
		int temp, size = arr.length;
		boolean swapped = true;
		for (int pass = size - 1; pass >= 0 && swapped; pass--) {
			swapped = false;
			for (int j = 0; j < pass; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap elements
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
		}
	}
}
