package com.main;

import java.util.Arrays;

public class PrefixWord {

	public static void main(String[] args) {
		String[] a = { "ar", "arp", "fin", "finance", "lb", "win", "winner" };
		Arrays.sort(a);
		for (int i = 0; i < a.length - 1; i++) {
			int j = 0;
			boolean flag = false;
			int minlen = Math.min(a[i].length(), a[i + 1].length());
			while (j < minlen) {
				if (a[i].charAt(j) != a[i + 1].charAt(j)) {
					flag = true;
				}
				if (flag) {
					break;
				}
				j++;

			}
			if (!flag) {
				System.out.println(a[i] + " " + a[i + 1]);
			}
		}
	}

}
