package com.main;

import java.util.Scanner;
import java.util.Stack;

public class PostfixSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		findSum(s);
	}

	private static void findSum(String s) {
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				st.push(s.charAt(i) - '0');
			} else if (s.charAt(i) == ' ') {
				continue;
			} else {
				int a = st.pop();
				int b = st.pop();
				int ans = method(a, b, s.charAt(i));
				st.push(ans);
			}

		}
		System.out.println(st.pop());
	}

	private static int method(int a, int b, char charAt) {
		switch (charAt) {
		case '+':
			return b + a;
		case '-':
			return b - a;
		case '*':
			return a * b;
		case '/':
			return b / a;
		}
		return 0;
	}

}
