package sorting;

public class Test {

	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		int[] arr = {4, 5, 1, 3, 2};
		b.bubbleSort(arr);
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
}
