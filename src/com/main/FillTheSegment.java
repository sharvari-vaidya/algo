package com.main;

import java.util.Scanner;

public class FillTheSegment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		int window = sc.nextInt();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int arr = sc.nextInt();
			a[arr - 1] = 1;
		}
		method(a, window);

	}

	private static void method(int[] a, int window) {

		int left = 0;
		int right = 0;
		int currWin = 0;
		int count = 0;
		int finalans = Integer.MAX_VALUE;
		while (right < a.length) {
			if (currWin == window) {
				finalans = Math.min(count, finalans);
				if (a[left] == 1) {
					count--;
				}
				left++;
				currWin--;

			}
			if (a[right] == 1) {
				count++;

			}
			right++;
			currWin++;
		}
		finalans = Math.min(count, finalans);
		System.out.println(finalans);

	}
}
