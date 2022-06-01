package com.example.dsa.sorting;

public class SelectionSort {
	void sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int min_inx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_inx])
					min_inx = j;
			}
			int temp = arr[min_inx];
			arr[min_inx] = arr[i];
			arr[i] = temp;
		}
		for (int k = 0; k < n; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int arr[] = { 64, 25, 12, 22, 11 };
		ss.sort(arr);
	}
}
