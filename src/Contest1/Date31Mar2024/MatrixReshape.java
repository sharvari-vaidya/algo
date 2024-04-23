package Contest1.Date31Mar2024;

import java.util.Scanner;

public class MatrixReshape {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int tarn = sc.nextInt();
		int tarm = sc.nextInt();
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		if (n * m > tarn * tarm) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}

		} else {
			int[][] method = method(a, n, m, tarn, tarm);
			for (int i = 0; i < tarn; i++) {
				for (int j = 0; j < tarm; j++) {
					System.out.print(method[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

	private static int[][] method(int[][] a, int n, int m, int tarn, int tarm) {
		if (n * m > tarn * tarm) {
			return a;
		}
		int[] extra = new int[n * m];
		int[][] ans = new int[tarn][tarm];
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				extra[count++] = a[i][j];
			}
		}
		count = 0;
		for (int i = 0; i < tarn; i++) {
			for (int j = 0; j < tarm; j++) {
				ans[i][j] = extra[count++];
			}

		}
		return ans;
	}
}