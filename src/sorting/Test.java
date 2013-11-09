package sorting;

public class Test {

	public static void main(String[] args) {
		SelectionSort s = new SelectionSort();
		int[] arr = {4, 5, 1, 3, 2};
		s.selectionSort(arr);
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
}
