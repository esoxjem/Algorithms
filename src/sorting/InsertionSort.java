package sorting;

public class InsertionSort {

	void insertionSort(int[] arr){
		int i, j, curr, size = arr.length;
		for (i = 1; i <= size - 1; i++){ //start from second element
			curr = arr[i];
			j = i;
			while(arr[j - 1] > curr &&  j > 0){
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = curr;
		}
	}
}
