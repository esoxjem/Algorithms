package ds.heaps;

public class Heap {

	int capacity; // size
	int heap_arr[];
	int count; // number of elements

	public Heap(int capacity, int heap_type) {
		this.capacity = capacity;
		heap_arr = new int[capacity];
	}

	int parent(int i) {
		if (i > 0 && i < count) {
			return (i - 1) / 2;
		}
		return -1;
	}

	int leftChild(int i) {
		int left = i * 2 + 1;
		if (left > count) {
			return -1;
		}
		return left;
	}

	int rightChild(int i) {
		int right = i * 2 + 2;
		if (right > count) {
			return -1;
		}
		return right;
	}

	int getMax() {
		if (count == 0)
			return -1;
		else
			return heap_arr[0];
	}

	// heapify O(logn)
	void percolateDown(int i) {
		int l, r, max, temp;
		l = leftChild(i);
		r = rightChild(i);
		
		if (l != -1 && heap_arr[l] > heap_arr[i])
			max = l;
		else
			max = i;
		if (r != -1 && heap_arr[r] > heap_arr[i])
			max = r;
		
		//swap
		if(max != i){
			temp = heap_arr[i];
			heap_arr[i] = heap_arr[max];
			heap_arr[max] = temp;
		}
		
		percolateDown(max);
	}
}
