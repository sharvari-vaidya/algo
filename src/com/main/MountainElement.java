package com.main;

public class MountainElement {
	public static void main(String[] args) {
		int[] a = { 0, 5, 3, 1 };
		int target = 1;
		System.out.println(finaMountain(a, target));
	}

	private static int finaMountain(int[] a, int target) {
		int peak = findPeak(0, a.length - 1, a, target);
		if (a[peak] == target) {
			return peak;
		}
		int ans = binarySearch(0, peak, a, target);
		if (ans == -1) {
			return binarySearch(peak + 1, a.length - 1, a, target);
		}
		return ans;

	}

	static int binarySearch(int left, int right, int[] a, int target) {
		if (a.length == 1) {
			return 0;
		}
		boolean flag = false;

		if (a[left] > a[right]) {
			flag = true;
		}

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (a[mid] == target) {
				return mid;
			} else if (a[mid] > target) {
				if (flag) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			} else {

				if (flag) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}

			}
		}

		return -1;

	}

	static int findPeak(int left, int right, int[] a, int target) {
		if (a.length == 1) {
			return 0;
		}
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (mid > 0 && mid < a.length - 1) {
				if (a[mid] > a[mid + 1] && a[mid] > a[mid - 1]) {
					return mid;
				} else if (a[mid] < a[mid + 1]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			} else if (mid == 0) {
				return a[mid] > a[mid + 1] ? 0 : 1;
			} else if (mid == a.length - 1) {
				return a[mid] > a[mid - 2] ? mid : mid - 2;
			}
		}
		return left;
	}

}
