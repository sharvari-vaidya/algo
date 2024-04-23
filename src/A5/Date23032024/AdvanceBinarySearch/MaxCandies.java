package A5.Date23032024.AdvanceBinarySearch;

import java.util.*;

public class MaxCandies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long numberOfCandies = sc.nextLong();
		System.out.println(findCandies(numberOfCandies));

	}

	private static long findCandies(long N) {
		long left = 1, right = Integer.MAX_VALUE;

		while (left <= right) {
			long mid = left + (right - left) / 2;
			if (mid * (mid + 1) / 2 <= N) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return right;

	}

}
