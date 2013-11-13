package sorting;

public class Test {

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int[] arr = { 1, 5, 4, 3, 2, 6, 7 };
		qs.quickSort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
