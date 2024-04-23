package A8.Date13Apr24.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueWindow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}

		findUnique(a, k);
	}

	private static void findUnique(int[] a, int k) {

		Map<Integer, Integer> map = new HashMap<>();
		int win = 0;
		int left = 0;
		int poi = 0;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		for(int i=0;i<a.length;i++) {
			
		}

	}

}
