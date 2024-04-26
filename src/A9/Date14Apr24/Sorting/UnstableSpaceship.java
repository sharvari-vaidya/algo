package A9.Date14Apr24.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UnstableSpaceship {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[2 * num];
		for (int i = 0; i < 2 * num; i++) {
			a[i] = sc.nextInt();
		}

		findUnstability(a);
	}

	private static void findUnstability(int[] a) {
		Arrays.sort(a);
		int finaldiff = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int diff = 0;
				List<Integer> l = new ArrayList<Integer>();
				for (int k = 0; k < a.length; k++) {
					if (k == i && k == j) {
						continue;
					}

					l.add(a[k]);
				}

				for (int k = 0; k < l.size(); k += 2) {

					diff = diff + Math.abs(l.get(k + 1) - l.get(k));

				}
				finaldiff = Math.min(finaldiff, diff);
			}

		}

		System.out.println(finaldiff == Integer.MAX_VALUE ? 0 : finaldiff);

	}

}
