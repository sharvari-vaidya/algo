package com.main;

import java.util.Scanner;
import java.util.Stack;

public class NearestHeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}
		nearestHeightFind(a);

	}

	private static void nearestHeightFind(int[] a) {
		Stack<Integer> st = new Stack<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (!st.isEmpty() && st.peek() <= a[i]) {
				st.pop();
				i--;

			} else if (!st.isEmpty() && st.peek() > a[i]) {
				int temp = st.peek();
				st.push(a[i]);
				a[i] = temp;

			} else {
				st.push(a[i]);
				a[i] = -1;

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
