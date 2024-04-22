package com.main;

public class FindPeakElement {

	public static void main(String[] args) {
		int[] a = { 1,2,3,4,5,7,14 };
		System.out.println(findPeak(a));
	}

	
	class Solution {
	    public int findPeakElement(int[] a) {
	        
			int left = 0, right = a.length - 1;
			while (left <= right) {
				int mid = left + (right - left) / 2;
				if (a[mid] <= a[mid + 1]) {
					left = mid ;
				} else {
					right = mid ;
				}
			}
			return left;
		
	    }
	}

	private static int findPeak(int[] a) {
		if (a.length == 1) {
			return 0;
		}
		int left = 0, right = a.length - 1;
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
