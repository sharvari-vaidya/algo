package com.main;

public class HIndex2 {
	public static void main(String[] args) {
		int[] a = { 0 };
		System.out.println(findHIndex(a));
	}

	private static int findHIndex(int[] a) {
		int left = 0;
		int right = a.length - 1;
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			if (a[mid] == (a.length - mid)) {
				return a[mid];
			} else if (a[mid] > (a.length - mid)) {
				right = mid;
			} else {
				left = mid;
			}
		}
		return a.length - left - 1;
	}

}
