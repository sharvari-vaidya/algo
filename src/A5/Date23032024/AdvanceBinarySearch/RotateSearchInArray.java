package A5.Date23032024.AdvanceBinarySearch;

import java.util.Scanner;

public class RotateSearchInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(searchInArray(a, n));
	}

	private static int searchInArray(int[] a, int n) {
		int left = -1, right = n;
		int min = Integer.MAX_VALUE;
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			if (a[mid] <= min) {
				left = mid;
			} else {
				right = mid;
			}
			min = a[mid];

		}

		return min;
	}

}
