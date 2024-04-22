package com.main;

public class SearchIn2DArray {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;

		search2DArray(matrix, target);

	}

	private static boolean search2DArray(int[][] a, int target) {
		boolean flag = false;
		int left=-1,right=a.length*a[0].length;
		while(left+1<right) {
			int mid=(left+right)/2;
			
			int row= mid/a[0].length;
			int col=mid%a[0].length;
			if(a[row][col]==target) {
				return true;
			}else if(a[row][col]>target) {
				right=mid;
			}else {
				left=mid;
			}
			
		}
		
		return flag;
	}

}
