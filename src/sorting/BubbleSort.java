package sorting;

public class BubbleSort {

	void bubbleSort(int arr[]) {
		int size = arr.length;
		for (int pass = size - 1; pass >= 0; pass--) { //in every pass largest element moves to the last
			for (int j = 0; j < pass; j++) {
				if (arr[j] > arr[j + 1]) {
					//swap elements
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
