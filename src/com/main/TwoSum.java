package com.main;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] a = { 2,3,4};
		int[] twoSum = twoSum(a, 6);
		System.out.println(twoSum[0] + " " + twoSum[1]);
	}

	public static int[] twoSum(int[] a, int target) {
		int[] ans = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int left = 0, right = a.length;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (map.containsKey(target - a[mid])) {
				ans[0] = map.get(target - a[mid]);
				ans[1] = mid;
				return ans;
			} else if (a[mid] > target) {
				map.put(a[mid], mid);
				right = mid - 1;
			} else {
				map.put(a[mid], mid);
				left = mid + 1;
			}
		}
		return ans;
	}

}
