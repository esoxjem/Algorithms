package sorting;

public class MergeSort {

	void mergeSort(int arr[]) {
		int size = arr.length;
		if (size < 2)
			return;
		int mid = size / 2;

		int[] left = new int[mid];
		int[] right = new int[size - mid];

		for (int i = 0; i < mid - 1; i++) {
			left[i] = arr[i];
		}
		for (int j = mid; j < size - 1; j++) {
			right[j - mid] = arr[j];
		}

		mergeSort(left);
		mergeSort(right);

		mergeLists(left, right, arr);
	}

	private void mergeLists(int[] left, int[] right, int[] arr) {
		int nL = left.length;
		int nR = right.length;

		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) {
			if (left[i] <= right[i]) {
				arr[k] = left[i];
				k++;
				i++;
			} else {
				arr[k] = right[j];
				k++;
				j++;
			}
		}
		while (i < nL) {
			arr[k] = left[i];
			k++;
			i++;
		}
		while (j < nR) {
			arr[k] = right[j];
			k++;
			j++;
		}

	}
}
