package A8.Date13Apr24.Hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numa = sc.nextInt();
		int numb = sc.nextInt();

		int[] a = new int[numa];
		int[] b = new int[numb];
		for (int i = 0; i < numa; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < numb; i++) {
			b[i] = sc.nextInt();
		}
		findUnion(a, b);
	}

	private static void findUnion(int[] a, int[] b) {
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if (!s.contains(a[i])) {
				s.add(a[i]);
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (!s.contains(b[i])) {
				s.add(b[i]);
			}
		}

		TreeSet<Integer> sortedSet = new TreeSet<>(s);
		Iterator<Integer> i = sortedSet.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");

		}

	}

}
