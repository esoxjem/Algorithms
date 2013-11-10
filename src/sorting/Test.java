package sorting;

public class Test {

	public static void main(String[] args) {
		InsertionSort is = new InsertionSort();
		int[] arr = {1, 5, 4, 3, 2};
		is.insertionSort(arr);
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
}
