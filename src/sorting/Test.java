package sorting;

public class Test {

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int[] arr = { 5, 3, 1, 4, 8, 2, 9, 7 };
		qs.quickSort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
