package A8.Date13Apr24.Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FrequencySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}

		findfre(a);
	}

	private static void findfre(int[] a) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
		}

		List<Map.Entry<Integer, Integer>> l = new ArrayList<>();
		l.addAll(map.entrySet());

		Comparator<Map.Entry<Integer, Integer>> com = new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				int res = o2.getValue() - o1.getValue();
				if (res == 0) {
					res = o1.getKey() - o2.getKey();
				}
				return res;
			}
		};
		Collections.sort(l, com);

		LinkedHashMap<Integer, Integer> lin = new LinkedHashMap<Integer, Integer>();
		for (Map.Entry<Integer, Integer> en : l) {
			lin.put(en.getKey(), en.getValue());
		}

		for (Map.Entry<Integer, Integer> ite : lin.entrySet()) {
			int val = ite.getValue();
			while (val > 0) {
				System.out.print(ite.getKey() + " ");
				val--;
			}
		}

	}

}
