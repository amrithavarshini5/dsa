package com.example.dsa.sorting;

public class BubbleSort {
	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		bs.bubbleSort(arr);
	}
}
