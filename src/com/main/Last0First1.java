package com.main;

public class Last0First1 {
	public static void main(String[] args) {
		int[] a= {0,0,0,0,1,1,1,1,1};
		int left=-1,right= a.length;
		while(left+1<right) {
			int mid=left+(right-left)/2;
			if(a[mid]==0) {
				left=mid;
			}else {
				right=mid;
			}
		}
		System.out.println("First 1 :: "+right+" Last 0 :: "+left);
	}


}
