package A12.Date27Apr24.BitManipulation1;

import java.util.Scanner;

public class LongestConsecutiveOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			int n = sc.nextInt();
			findLongestConsecutiveOne(n);
		}
	}

	private static void findLongestConsecutiveOne(int num) {
		String binaryString = Integer.toBinaryString(num);
		char[] an = binaryString.toCharArray();
		int maxCount = 0;
		int count = 0;
		for (int i = 0; i < an.length; i++) {
			if (an[i] == '1') {
				count++;
			} else {
				count = 0;
			}
			if (maxCount < count) {
				maxCount = count;
			}
		}
		System.out.println(maxCount);

	}

}
