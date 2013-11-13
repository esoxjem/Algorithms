package sorting;

public class QuickSort {

	void quickSort(int arr[], int start, int end) {
		if (start >= end)
			return;

		int pIndex = partition(arr, start, end);
		quickSort(arr, start, pIndex - 1);
		quickSort(arr, pIndex + 1, end);
	}

	private int partition(int arr[], int start, int end) {
		int temp;
		int pivot = arr[end];
		int pIndex = start;

		for (int i = start; i < end; i++) {
			if (arr[i] <= pivot) {
				// swap
				temp = arr[pIndex];
				arr[pIndex] = arr[i];
				arr[i] = temp;

				pIndex++;
			}
		}
		// swap pivot and partition index
		temp = arr[pIndex];
		arr[pIndex] = arr[end];
		arr[end] = temp;

		return pIndex;
	}
}
