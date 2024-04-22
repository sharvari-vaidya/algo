package com.main;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int[] a = { 1, -1 };
		int k = 1;

		findWindow(a, k);

	}

	private static int[] findWindow(int[] a, int k) {
		int[] ans = new int[a.length - k + 1];
		int window = 0;
		int windowMax = Integer.MIN_VALUE;
		int c = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {

			windowMax = Math.max(a[i], windowMax);
			window++;
			if (window == k) {
				max = Math.max(max, windowMax);
				ans[c] = max;
				c++;
				window--;
				windowMax = Integer.MIN_VALUE;
			}
		}
		return ans;

	}

}
