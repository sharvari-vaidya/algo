package A5.Date23032024.AdvanceBinarySearch;

import java.util.*;

public class BoxPacking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numberOfTest = sc.nextInt();
		for (int i = 0; i < numberOfTest; i++) {
			int width = sc.nextInt();
			int height = sc.nextInt();
			int num = sc.nextInt();
			System.out.println(findNumOfBoxes(width, height, num));
		}
	}

	private static long findNumOfBoxes(int width, int height, int num) {

		long left = 1, right = 1;
		long prod = 0;
		while (prod <= num) {

			prod = (right / width) * (right / height);
			right = right * 2;
		}

		while (left <= right) {
			long mid = left + (right - left) / 2;
			if (predicate(mid, width, height, num) == 0) {

				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}

		return left;
	}

	private static int predicate(long mid, long width, long height, long num) {
		long ans = (mid / width) * (mid / height);
		if (ans >= num) {
			return 0;
		}

		return 1;
	}

}
