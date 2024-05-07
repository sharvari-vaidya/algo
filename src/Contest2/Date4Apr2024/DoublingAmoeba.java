package Contest2.Date4Apr2024;

import java.util.Scanner;

public class DoublingAmoeba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		findAmoebaNum(x);
	}

	private static void findAmoebaNum(int x) {
		int counter = 0;
		while (x > 0) {
			counter = counter + (x % 2);
			x = x / 2;

		}
		System.out.println(counter);

	}

}
