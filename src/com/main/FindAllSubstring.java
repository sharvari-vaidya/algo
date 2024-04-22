package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindAllSubstring {
	static List<String> ans = new ArrayList<String>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		findSub(s, "");
		Collections.sort(ans);
		for (String a : ans) {
			System.out.println(a);
		}
	}

	private static void findSub(String s, String perString) {
		if (s.length() == 0) {
			ans.add(perString);
//			System.out.println(perString);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			String newString = s.substring(0, i) + s.substring(i + 1);
			findSub(newString, perString + s.charAt(i));
		}
	}

}
