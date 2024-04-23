package A8.Date13Apr24.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}

		findUniqueele(a, k);
	}

	private static void findUniqueele(int[] a, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int win = 0;
		int left = 0;
		for (int i = 0; i < a.length; i++) {

			win++;

			map.put(a[i], map.getOrDefault(a[i], 0) + 1);

			if (win == k) {
				System.out.print(map.size() + " ");
				if (map.get(a[left]) == 1) {
					map.remove(a[left]);
				} else {
					map.put(a[left], map.get(a[left]) - 1);
				}
				left++;
				win--;

			}

		}
	}

}
