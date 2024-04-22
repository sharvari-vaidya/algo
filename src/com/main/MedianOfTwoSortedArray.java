package com.main;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		int[] a = { 2 };
		int[] b = {};
		System.out.println(median(a, b));
	}

	private static double median(int[] a, int[] b) {
		int len1 = a.length;
		int len2 = b.length;
		if (a.length > b.length) {
			median(b, a);
		}
		if (a.length == 0) {
			double add = b[len2 / 2] + b[(len2 - 1) / 2];
			return len2 % 2 == 0 ? add / 2.0 : b[len2 / 2];
		}
		if (b.length == 0) {
			double add = a[len1 / 2] + a[(len1 - 1) / 2];
			return len1 % 2 == 0 ? add / 2.0 : a[len1 / 2];
		}

		int medI = len1 + len2 + 1;
		int left = 0, right = a.length;
		while (left <= right) {
			int mid1 = left + (right - left) / 2;
			int mid2 = (medI / 2) - mid1;
			int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE, r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
			if (mid1 - 1 >= 0)
				l1 = a[mid1 - 1];
			if (mid2 - 1 >= 0)
				l2 = b[mid2 - 1];
			if (mid1 < len1)
				r1 = a[mid1];
			if (mid2 < len2)
				r2 = b[mid2];

			if (l2 <= r1 && l1 <= r2) {
				if ((len1 + len2) % 2 == 0) {
					return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
				} else {
					return Math.max(l1, l2);
				}
			} else if (l1 > r2) {
				right = mid1 - 1;
			} else {
				left = mid1 + 1;
			}

		}

		return 0;

	}

}
