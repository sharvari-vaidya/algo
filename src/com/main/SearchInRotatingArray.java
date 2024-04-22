package com.main;

import java.util.Scanner;

public class SearchInRotatingArray {

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
		int left = 0, right = n-1;
		int min = Integer.MAX_VALUE;
		while (left  <= right) {
			int minmin= Integer.MAX_VALUE;
			int mid = left + (right - left) / 2;
			if (a[mid] >a[left]) {
				minmin=Math.min(a[mid], a[left]);
				left = mid+1;
			} else {
				minmin=Math.min(a[mid], a[right]);
				right = mid-1;
			}
			
			if(minmin<min) {
				min=minmin;
			}

		}

		return min;
	}

}
