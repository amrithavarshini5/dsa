package com.example.dsa.sorting;

public class BubbleSortOptimized {

	void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped = false;
		int temp;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		BubbleSortOptimized bs = new BubbleSortOptimized();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		bs.bubbleSort(arr);
	}
}
