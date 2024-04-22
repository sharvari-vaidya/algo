package com.main;

public class FindEleInRotatedSortedArray {
	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1 };
		int target = 2;

		boolean left = extracted(a, target);

		System.out.println(left);
	}

	private static boolean extracted(int[] a, int target) {
		int left = 0, right = a.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (a[mid] == target) {
				return true;
			}
			while (left < mid && a[mid] == a[left]) {
				left++;
			}
			while (mid < right && a[mid] == a[right]) {
				right--;
			}
			if (a[mid] <= a[right]) {
				if (a[mid] <= target && a[right] >= target) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			} else {
				if (a[mid] >= target && a[left] <= target) {

					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
		}
		return false;
	}

}
