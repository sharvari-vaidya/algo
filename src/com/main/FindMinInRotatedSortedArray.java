package com.main;

public class FindMinInRotatedSortedArray {

	public static void main(String[] args) {
		int[] a = { 1, 2 };

		int left = extracted(a);

		System.out.println(left);
	}

	private static int extracted(int[] a) {
		int minEle = Integer.MAX_VALUE;
		int left = 0, right = a.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
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
