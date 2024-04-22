package com.main;

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
		
		int[] rowSum=new int[row];
		int[] colSum=new int[row];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				rowSum[i]=rowSum[i]+a[i][j];
			}
		}

		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				colSum[i]=colSum[i]+a[j][i];
			}
		}
		
		int maxSum=Integer.MIN_VALUE;
		
		for(int i=0;i<rowSum.length;i++) {
			maxSum=Math.max(maxSum, rowSum[i]);
		}
		for(int i=0;i<colSum.length;i++) {
			maxSum=Math.max(maxSum, colSum[i]);
		}
		
		int result=0;
		for(int i=0;i<rowSum.length;i++) {
			result=result+(maxSum-rowSum[i]);
		}
		
		System.out.println(result);

		
	}

}
