package A4.Date17Mar24.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class RangeSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int range = sc.nextInt();
		int[] numArray = new int[num];
		int[][] rangeArray = new int[range][range];
		for (int i = 0; i < num; i++) {
			numArray[i] = sc.nextInt();
		}
		for (int i = 0; i < range; i++) {
			for (int j = 0; j < range; j++) {
				rangeArray[i][j] = sc.nextInt();
			}
		}
		Arrays.sort(numArray);
		for (int i = 0; i < range; i++) {
			System.out.println(findRange(numArray, rangeArray[i][0], rangeArray[i][1]));

		}
	}

	private static int findRange(int[] numArray, int upper, int lower) {

		int left = -1, right = numArray.length;
		while (left + 1 < right) {
			int mid=left+(right-left)/2;
			if(helperFunc(numArray[mid],upper,lower)==0) {
				right=mid;
			}else {
				left=mid;
			}
		}

		return -1;
	}

	private static int helperFunc(int mid, int upper, int lower) {
		if(mid>upper) {
			return 0;
		}
		return 1;
	}

}
