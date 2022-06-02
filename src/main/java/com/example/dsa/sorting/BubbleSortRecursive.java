package com.example.dsa.sorting;

public class BubbleSortRecursive {
	void bubbleSort(int[] arr, int n) {

		// base case
		if (n == 1)
			return;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}

			bubbleSort(arr, n - 1);
		}
	}

	public static void main(String[] args) {
		BubbleSortRecursive bs = new BubbleSortRecursive();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		bs.bubbleSort(arr, arr.length);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
