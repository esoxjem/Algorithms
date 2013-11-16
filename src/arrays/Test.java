package arrays;

public class Test {

	public static void main(String[] args) {
		Delete d = new Delete();
		int[] arr = { 5, 3, 1, 4, 8, 2, 9, 7 };
		d.delete(arr, 6);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
