package A9.Date14Apr24.Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CowArrival {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long[][] a = new long[num][2];
		for (int i = 0; i < num; i++) {
			a[i][0] = sc.nextLong();
			a[i][1] = sc.nextLong();
		}

		findArrivalTime(a);

	}

	private static void findArrivalTime(long[][] a) {
		Arrays.sort(a, Comparator.comparingLong(row -> row[0]));
		long ans = 0;

		for (int i = 0; i < a.length; i++) {
			if (ans < a[i][0]) {
				ans += a[i][0] - ans;
			}
			ans += a[i][1];

		}

		System.out.println(ans);

	}

}
