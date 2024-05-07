package Contest2.Date4Apr2024;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EasyCounting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		findCounting(s);

	}

	private static void findCounting(String s) {
		Map<Character, Long> map = new HashMap<>();
		long ans = 0;

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), (long) 0) + 1);
		}

		for (Map.Entry<Character, Long> en : map.entrySet()) {

			ans = ans + (en.getValue() * en.getValue());

		}
		System.out.println(ans);

	}

}
