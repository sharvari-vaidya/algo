package com.main;

public class MatrixSearch {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		searchInMatrix(a, 18);
	}

	private static void searchInMatrix(int[][] a, int tar) {
		int left = -1, right = a.length * a[0].length;
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			int row = mid / a[0].length;
			int col = mid % a[0].length;
			if (predicate(a, row, col, tar) == 0) {
				left = mid;
			} else {
				right = mid;
			}
		}
		System.out.println(left / a[0].length + " " + left % a[0].length);
	}

	private static int predicate(int[][] a, int row, int col, int tar) {
		if (a[row][col] <= tar) {
			return 0;
		}
		return 1;
	}

}
