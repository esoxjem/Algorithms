package ds.sorting;

public class ShellSort {

	void shellSort(int[] arr) {
		int size = arr.length, inner, outer, temp;
		int interval = 1;

		while (interval <= size / 3)
			interval = interval * 3 + 1; // (1, 4, 13, 40, 121, ...)

		while (interval > 0) // decreasing interval, until interval=1
		{
			// interval-sort the file
			for (outer = interval; outer < size; outer++) {
				temp = arr[outer];
				inner = outer;
				// one subpass (eg 0, 4, 8)
				while (inner > interval - 1 && arr[inner - interval] >= temp) {
					arr[inner] = arr[inner - interval];
					inner -= interval;
				}
				arr[inner] = temp;
			}
			interval = (interval - 1) / 3; // decrease interval
		}
	}
}
