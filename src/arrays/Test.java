package arrays;

public class Test {

	public static void main(String[] args) {

		int[] arr = { 2, 3, 1, 4, 8, 2, 9, 7 };

		LinearSearch ls = new LinearSearch();
		System.out.println(ls.linearSearch(arr, 2));

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
