package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum4 {
	public static void main(String[] args) {
		int[] a = { 1000000000, 1000000000, 1000000000, 1000000000 };
		int target = -294967296;
		List<List<Integer>> fourSum = fourSum(a, target);
		System.out.println(fourSum.toString());
	}

	public static List<List<Integer>> fourSum(int[] a, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {
			if (i != 0 && a[i] == a[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < a.length - 1; j++) {
				if (j != i + 1 && a[j] == a[j - 1]) {
					continue;
				}

				int k = j + 1;
				int l = a.length - 1;

				while (k < l) {
					long sum1 = (long)a[i] + a[j] + a[k] + a[l];

					if (sum1 > Long.MAX_VALUE) {
						continue;
					}
					long sum = (long) sum1;
					if (sum1 == target) {
						List<Integer> lis = new ArrayList<Integer>();

						lis.add(a[i]);
						lis.add(a[j]);
						lis.add(a[k]);
						lis.add(a[l]);

						result.add(lis);

						while (k < l && a[k] == a[k + 1]) {
							k++;
						}
						while (k < l && a[l] == a[l - 1]) {
							l--;
						}
						k++;
						l--;
					} else if (sum < target) {
						k++;
					} else {
						l--;
					}
				}
			}
		}
		return result;

	}

}
