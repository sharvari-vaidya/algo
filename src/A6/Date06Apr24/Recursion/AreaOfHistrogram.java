package A6.Date06Apr24.Recursion;

import java.util.Scanner;
import java.util.Stack;

public class AreaOfHistrogram {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] a = new int[num];
//		for (int i = 0; i < num; i++) {
//			a[i] = sc.nextInt();
//		}
		int[] a = { 2, 1, 5, 6, 2, 3 };

		System.out.println(findArea(a));
//		findArea(a);
	}

	private static int findArea(int[] a) {
		Stack<Integer> st = new Stack<Integer>();
		int[] l = new int[a.length];
		int[] r = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			if (st.isEmpty()) {
				l[i] = 0;
			} else {
				while (!st.isEmpty() && a[st.peek()] >= a[i]) {
					st.pop();
				}
				l[i] = st.empty() ? 0 : st.peek() + 1;
			}
			st.push(i);
		}

		st.clear();

		for (int i = a.length - 1; i >= 0; i--) {

			if (st.isEmpty()) {
				r[i] = a.length - 1;
			} else {
				while (!st.isEmpty() && a[st.peek()] > a[i]) {
					st.pop();
				}
				r[i] = st.empty() ? a.length - 1 : st.peek() - 1;
			}
			st.push(i);
		}
		int maxArea = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			maxArea = Math.max(maxArea, a[i] * (r[i] - l[i] + 1));
		}

		return maxArea;

	}

}
