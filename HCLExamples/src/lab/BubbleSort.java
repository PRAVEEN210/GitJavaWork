package lab;

public class BubbleSort {

	void sort(int array[]) {
		int n = array.length;

		
		for (int i = 0; i < n - 1; i++) {
			
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (array[j] < array[min_idx])
					min_idx = j;

			
			int temp = array[min_idx];
			array[min_idx] = array[i];
			array[i] = temp;
		}
	}

	void printArray(int array[]) {
		int n = array.length;
		for (int i = 0; i < n; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}

//Driver code to test above
	public static void main(String args[]) {
		BubbleSort ob = new BubbleSort();
		int array[] = { 4, 8, 1, 3, 45, 12, 24, 13, 18, 20 };
		ob.sort(array);
		System.out.println("Array elements after sorting:");
		ob.printArray(array);
	}
}

