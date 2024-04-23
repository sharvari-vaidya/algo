package Contest1.Date31Mar2024;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[] numArray = new int[num];

		for (int i = 0; i < num; i++) {
			numArray[i] = sc.nextInt();
		}

		findTriang(numArray);
	}

	private static void findTriang(int[] an) {
		Arrays.sort(an);

		int count = 0;
		for (int i = 0; i < an.length; i++) {
			for (int j = i + 1; j < an.length; j++) {
				for (int k = j + 1; k < an.length; k++) {
					if (((an[i] + an[j]) > an[k]) && ((an[j] + an[k]) > an[i]) && ((an[i] + an[k]) > an[j])) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
