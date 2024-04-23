package A4.Date17Mar24.BinarySearch;

import java.util.Scanner;

public class FirstAndLastIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int num = sc.nextInt();
		int[] numArray = new int[num];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			numArray[i] = sc.nextInt();

		}
		for (int i = 0; i < num; i++) {

			System.out.println(getFirstOccurance(a, numArray[i]) + " " + getLastOccurance(a, numArray[i]));

		}

	}

	private static int getFirstOccurance(int[] a, int num) {

		int left = -1;
		int right = a.length;

		while (left + 1 < right) {
			int mid = left + (right - left) / 2;

			if (helperFunction(a[mid], num) == 0) {
				left = mid;
			} else {
				right = mid;
			}
		}
		if (a.length == right)
			return -1;
		else if (a[right] == num) {
			return right;
		} else {
			return -1;
		}
	}

	private static int helperFunctionLast(int mid, int num) {
		if (mid <= num) {
			return 0;
		}

		return 1;
	}

	private static int helperFunction(int mid, int num) {
		if (mid < num) {
			return 0;
		}

		return 1;
	}

	private static int getLastOccurance(int[] a, int num) {
		int left = -1, right = a.length;
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			if (helperFunctionLast(a[mid], num) == 0) {
				left = mid;
			} else {
				right = mid;
			}
		}
		if (left < 0) {
			return -1;
		} else if (a[left] == num) {
			return left;
		} else {
			return -1;
		}

	}

}
