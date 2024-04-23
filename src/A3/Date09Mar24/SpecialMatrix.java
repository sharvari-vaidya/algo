package A3.Date09Mar24;

import java.util.Scanner;

public class SpecialMatrix {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int[][] a = new int[row][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		int[] rowSum = new int[row];
		int[] colSum = new int[row];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				rowSum[i] = rowSum[i] + a[i][j];
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				colSum[i] = colSum[i] + a[j][i];
			}
		}
		
	}
}
