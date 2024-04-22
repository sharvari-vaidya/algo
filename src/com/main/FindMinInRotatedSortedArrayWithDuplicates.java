package com.main;

public class FindMinInRotatedSortedArrayWithDuplicates {
	public static void main(String[] args) {

		int[] a = { 2, 2, 2, 0, 1 };

		int left = extracted(a);

		System.out.println(left);

	}

	private static int extracted(int[] a) {
		int minEle = Integer.MAX_VALUE;
		int left = 0, right = a.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			while (left < mid && a[left] == a[mid]) {
				left++;
			}
			while (right > mid && a[right] == a[mid]) {
				right--;
			}
			if (a[mid] <= a[right]) {
				minEle = Math.min(a[mid], minEle);
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}

		return minEle;
	}
}
