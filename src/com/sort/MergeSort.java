package com.sort;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = { 23, 1, 10, 5, 2 };
		int[] temp = new int[a.length];

		mergeSort(a, temp, 0, a.length - 1);

	}

	private static void mergeSort(int[] a, int[] temp, int left, int right) {

		while (left < right) {
			int mid = left + (right - left) / 2;

			mergeSort(a, temp, left, mid);
			mergeSort(a, temp, mid + 1, right);

			mergeArray(a, temp, left, mid, right);

		}

	}

	private static void mergeArray(int[] a, int[] temp, int left, int mid, int right) {

		int poi = left;
		int leftpoi = left;
		int rightpoi = right;
		while (leftpoi < rightpoi) {
			if (a[leftpoi] <= a[rightpoi]) {
				temp[poi] = a[leftpoi];
				leftpoi++;
			} else {
				temp[poi] = a[rightpoi];
				rightpoi++;
			}
			poi++;
		}
		for (int i : temp) {
			System.out.println(i);
		}

	}

}
