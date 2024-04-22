package com.main;

public class Citation {
	public static void main(String[] args) {
		int[] a = { 11, 15 };
		System.out.println(cit(a));
	}

	private static int cit(int[] a) {

		// if(a.length==1 && a[0]>1 ) return 1;
		int left = 0;
		int right = a.length - 1;
		int ans = 0;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (a.length - mid >= a[mid]) {
				ans = a[mid];
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		if (right == -1)
			return 1;
		return a[right];
	}
}
