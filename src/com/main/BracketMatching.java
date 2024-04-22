package com.main;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class BracketMatching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] matchingbracket = matchingbracket(s);
		for (int j : matchingbracket)
			System.out.print(j + " ");
	}

	private static int[] matchingbracket(String s) {
		int[] ans = new int[s.length()];
		Arrays.fill(ans, -1);
		Stack<Character> st = new Stack<Character>();
		Stack<Integer> stInt = new Stack<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (!st.isEmpty() && s.charAt(i) == ')' && st.peek() == '(') {
				ans[i] = stInt.peek();
				ans[stInt.peek()] = i;
				stInt.pop();
				st.pop();
			} else {
				st.push(s.charAt(i));
				stInt.push(i);
			}
		}
		return ans;
	}
}
