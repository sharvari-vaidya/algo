package A6.Date06Apr24.Recursion;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(findFibbo(num));

	}

	private static int findFibbo(int num) {
		if (num <= 1) {
			return num;
		}
		return findFibbo(num - 1) + findFibbo(num - 2);
	}

}
