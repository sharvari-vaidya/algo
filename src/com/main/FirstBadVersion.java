package com.main;

public class FirstBadVersion {
	public static void main(String[] args) {
		int n = 6;
		System.out.println(findVersion(n));
	}

	private static int findVersion(int n) {
		int left = 1, right = n;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (predicate(mid) == 0) {
				left = mid+1;
			} else {
				right = mid-1;
			}
		}
		return left;

	}

	private static int predicate(int mid) {
		boolean[] a = { false, false, false, true, true };
		if (a[mid-1] == false) {
			return 0;
		}
		return 1;
	}

}
