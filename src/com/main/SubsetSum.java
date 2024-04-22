package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubsetSum {
	static int minsum = Integer.MAX_VALUE;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[] a = new int[num];

		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}
		int maxSum = 0;
		for (int i : a) {
			maxSum += i;
		}
		subsetsum(a, maxSum);

		System.out.println(minsum);

	}

	private static void subsetsum(int[] a, int maxSum) {

		for (int i = 0; i < a.length; i++) {
//			subsetsum(Arrays.copyOf(original, newLength), maxSum);
		}

	}

	/*
	 * def subset_sum(i,temp): if i == n-1: return abs(total - temp - temp) pick =
	 * subset_sum(i+1,temp+arr[i+1]) notpick = subset_sum(i+1,temp) return
	 * min(pick,notpick) print(subset_sum(0,0))
	 */

}
