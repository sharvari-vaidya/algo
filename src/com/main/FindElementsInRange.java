package com.main;

import java.util.Arrays;

public class FindElementsInRange {
	public static void main(String[] args) {

		int[] a = { 1, 5, 2, 3, 5 };
		int upper = 12;
		int lower = 4;
		Arrays.sort(a);
		int lowerRange = findRange(a, lower);
		int upperRange = findRange(a, upper);
		System.out.println(upperRange - lowerRange + 1);
	}

	private static int findRange(int[] a, int upper) {
		int left = -1, right = a.length;
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			if (predicate(a[mid],upper) == 0) {
				left = mid;
			} else {
				right = mid;
			}
		}
		return left;
	}

	private static int predicate(int mid, int upper) {
		if (mid <= upper) {
			return 0;
		}
		return 1;
	}

}
