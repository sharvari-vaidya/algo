package A5.Date23032024.AdvanceBinarySearch;

import java.util.*;

public class EmptyPile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(findAns(a, h));

//		4 5
//		1 2 3 4
	}

	private static int findAns(int[] a, int h) {
		int left = 0, right = 0;
		for (int i = 0; i < a.length; i++) {
			right = Math.max(right, a[i]);
		}
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			if (predicate(mid, a, h) == 0) {
				left = mid;
			} else {
				right = mid;
			}
		}

		return right;
	}

	private static int predicate(int mid, int[] a, int h) {
		int Operations = 0;
		for (int i = 0; i < a.length; i++) {
			Operations = Operations + ceil(a[i], mid);
		}
		if (Operations <= h) {
			return 1;
		}

		return 0;
	}

	private static int ceil(int num, int mid) {
		if (num % mid == 0) {
			return num / mid;
		}
		return num / mid + 1;
	}

}
