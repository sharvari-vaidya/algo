package A4.Date17Mar24.BinarySearch;

import java.util.Scanner;

public class DirectBinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int query = sc.nextInt();
		int[] numArray = new int[num];
		int[] queryArray = new int[query];

		for (int i = 0; i < num; i++) {
			numArray[i] = sc.nextInt();
		}
		for (int i = 0; i < query; i++) {
			queryArray[i] = sc.nextInt();
		}

		for (int k = 0; k < queryArray.length; k++) {
			int i = 0;
			int j = num - 1;
			while (i <= j) {
				int mid = (i + j) / 2;
				if (numArray[mid] == queryArray[k]) {
					System.out.println(mid);
					break;
				} else if (numArray[mid] > queryArray[k]) {
					j = mid-1 ;

				} else {
					i = mid +1;
				}
			}
		}

	}

}
