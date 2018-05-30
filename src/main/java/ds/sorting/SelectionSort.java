package ds.sorting;

public class SelectionSort {

	void selectionSort(int[] arr) {
		int size = arr.length;
		int min, temp, i, j;
		for (i = 0; i < size - 1; i++) { // till second last element
			min = i;
			for (j = i + 1; j < size; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			// swap elements
			if(min != i){
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
