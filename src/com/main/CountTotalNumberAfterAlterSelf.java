package com.main;

import java.util.ArrayList;
import java.util.List;

public class CountTotalNumberAfterAlterSelf {
	public static void main(String[] args) {
		int[] a = { 12, 1, 2, 3, 4, 0, 11, 4 };

		List<Integer> left = extracted(a);
		for (int i = 0; i < left.size(); i++) {
			System.out.println(left.get(i));
		}
	}

	private static List<Integer> extracted(int[] a) {
		List<Integer> ans = new ArrayList<Integer>();
		for (int i : a) {
			ans.set(i, ans.get(i) + 1);
		}
		return ans;
	}
//	private static List<Integer> extracted(int[] a) {
//		List<Integer> ans = new ArrayList<Integer>();
//		for (int i = 0; i < a.length; i++) {
//			int count = 0;
//			if (i > 0 && i < a.length && a[i] == a[i - 1]) {
//				ans.add(ans.get(i - 1));
//				continue;
//
//			}
//			for (int j = i + 1; j < a.length; j++) {
//				while (j < a.length - 1 && a[j] == a[j + 1]) {
//					j++;
//				}
//				if (a[i] > a[j]) {
//					count++;
//				}
//			}
//			ans.add(count);
//		}
//		return ans;
//	}
}
