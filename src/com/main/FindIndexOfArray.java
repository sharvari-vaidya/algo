package com.main;

public class FindIndexOfArray {

	public static void main(String[] args) {
		int[] a = { 5, 7, 7, 8, 10 };
		int[] ans = new int[2];
		ans[0] = findFirstOccu(a, 6);
		ans[1] = findLastOcc(a, 6);
		System.out.println(ans[0]+" "+ans[1]);
	}

	private static int findLastOcc(int[] a, int tar) {
		int left = -1, right = a.length;
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			if (predicateLast(a[mid], tar) == 0) {
				left = mid;
			} else {
				right = mid;
			}
		}
		return left;

	}

	private static int predicateLast(int mid, int tar) {
		if (mid <= tar) {
			return 0;
		}

		return 1;
	}

	private static int findFirstOccu(int[] a, int tar) {
		int left = -1, right = a.length;
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			if (predicate(a[mid], tar) == 0) {
				left = mid;
			} else {
				right = mid;
			}
		}
		return right;
	}

	private static int predicate(int mid, int tar) {
		if (mid < tar) {
			return 0;
		}
		return 1;
	}
}
