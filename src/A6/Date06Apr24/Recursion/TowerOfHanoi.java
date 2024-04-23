package A6.Date06Apr24.Recursion;

import java.util.Scanner;

import javax.print.attribute.standard.Destination;

public class TowerOfHanoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int totalMoves = (int) Math.pow(2, num) - 1;
		System.out.println(totalMoves);
		towerOfhanoi(num, 1, 2, 3);
	}

	private static void towerOfhanoi(int num, int source, int desti, int intermediate) {
		if (num == 1) {
			System.out.println(num + " " + source + " " + desti);
			return;
		} else {
			towerOfhanoi(num - 1, source, intermediate, desti);
			System.out.println(num + " " + source + " " + desti);
			towerOfhanoi(num - 1, intermediate, desti, source);
		}
	}
}
