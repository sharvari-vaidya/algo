package A3.Date09Mar24;

import java.util.Scanner;

public class TopolitzMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col= sc.nextInt();
		int[][] a= new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println(topolitzMatrix(a,row,col));

	}
	
	
//	9 7 4 2 1
//	4 9 7 4 2
//	1 4 9 7 4
//	6 1 4 9 7
	static int topolitzMatrix(int[][] a, int row, int col) {
		
		for(int i=1;i<row;i++) {
			for(int j=1;j<col;j++) {
				if(!(a[i][j]!=a[i-1][j-1])) {
					return 0;
				}
			}
		}
		
		return 1;
		
	}

}
