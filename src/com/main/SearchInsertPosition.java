package com.main;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] a = { 1, 3, 3, 3, 5, 6 };
		int target = 7;
		searchInsert(a, target);

	}

	public static int searchInsert(int[] a, int target) {

		int left = -1, right = a.length;
		while (left + 1 < right) {
			int mid = (left + right) / 2;

			if (a[mid] >= target) {
				right = mid;
			} else {
				left = mid;
			}

		}
		System.out.println(right);

		return 0;

	}

}
