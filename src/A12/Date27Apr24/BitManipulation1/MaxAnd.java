package A12.Date27Apr24.BitManipulation1;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAnd {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] a = new int[len];
		for (int i = 0; i < len; i++) {

			a[i] = sc.nextInt();
		}
		findMaxAnd(a, len);

	}

	private static void findMaxAnd(int[] a, int len) {
		if (len < 2) {
			System.out.println(0);
			return;
		}
		int maxAndVal = Integer.MIN_VALUE;
		Arrays.sort(a);
		for (int i = len - 1; i >= 0; i--) {

			for (int j = Math.max(0, i - 1); j <= i + 1 && j < a.length; j++) {

				if (i != j) {

					int cou = a[i] & a[j];
					if (maxAndVal < cou) {
						maxAndVal = cou;
					}
				}
			}
		}
		System.out.println(maxAndVal);
	}

}
