package com.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zerosum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}

		findZeroSum(a);
	}

	private static void findZeroSum(int[] a) {

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int sum = 0;
		for (int i : a) {
			sum = sum + i;
			if (hm.containsKey(sum)) {
				hm.put(sum, hm.get(sum) + 1);
				System.out.println("YES");
				System.exit(0);
			} else {
				hm.put(sum, 1);
			}
		}
		System.out.println("NO");

	}

}
