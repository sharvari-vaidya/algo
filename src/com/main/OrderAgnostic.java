package com.main;

import java.util.Arrays;

public class OrderAgnostic {
	public static void main(String[] args) {
		int[] a = { 50, 40, 30, 20, 10 };
//		Arrays.sort(a);
		boolean flag = a[0] > a[a.length - 1];
		findMid(a, flag, 40);
	}

	private static void findMid(int[] a, boolean flag, int target) {
		int left = -1;
		int right = a.length;
		while (left + 1 < right) {
			int mid = (left + right) / 2;

			if (a[mid] == target) {
				System.out.println(mid);
				break;
			} else if (a[mid] > target) {
				if (flag) {
					left = mid;
				} else {
					right = mid;
				}
			} else {
				if (flag) {
					right = mid;
				} else {
					left = mid;
				}

			}
		}

	}

}
