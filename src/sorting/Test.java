package sorting;

public class Test {

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int[] arr = { 1, 5, 4, 3, 2, 6, 7 };
		ms.mergeSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
