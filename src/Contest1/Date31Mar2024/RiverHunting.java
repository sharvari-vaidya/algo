package Contest1.Date31Mar2024;

import java.util.Scanner;

public class RiverHunting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			System.out.println(method(input));
		}
	}

	private static int method(int input) {

		int left = 0, right = input;
		int count = 0;
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			if (mid == input) {
				count++;
				return count;
			} else if (mid < input) {
				left = mid;
			} else {
				right = mid;
			}
			count++;
		}

		return count;
	}
}
