package arrays;

public class LinearSearch {

	String linearSearch(int arr[], int val) {
		String indexes = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				indexes += i + " ";
			}
		}
		return indexes;
	}
}
