package ds.arrays;

public class Delete {

	void delete(int arr[], int index) {
		if (index < arr.length) {
			for (int i = index; i < arr.length - 1; i++) { // n-1th index
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = -1;
		}
	}
}
