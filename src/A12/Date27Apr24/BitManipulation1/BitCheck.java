package A12.Date27Apr24.BitManipulation1;

import java.util.Scanner;

public class BitCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = sc.nextInt();
		findkthbit(num, k);
	}

	private static void findkthbit(int num, int k) {
		int ans = (num & (1 << k)) == 0 ? 0 : 1;
		System.out.println(ans);

	}

}
