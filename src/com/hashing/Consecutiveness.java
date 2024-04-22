package com.hashing;

import java.util.HashSet;
import java.util.Scanner;

import com.main.MaxCandies;

public class Consecutiveness {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}

		findMaxCon(a);
	}

	private static void findMaxCon(int[] a) {
		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i : a) {
			hs.add(i);
		}
		int maxCount = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			int count = 1;
			if (!hs.contains(a[i] - 1)) {
				while (hs.contains(num + 1)) {
					count++;
					num++;
				}
				maxCount = Math.max(count, maxCount);
			}
		}
		System.out.println(maxCount);

	}

}
