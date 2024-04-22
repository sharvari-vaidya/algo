package com.main;

import java.util.HashMap;
import java.util.Map;

public class SqrtOfNum {

	public static void main(String[] args) {
		int num = 2147395599;
		findSqrt(num);
	}

	static int findSqrt(int num) {
		long left=-1,right=num;
		while(left+1<right) {
			long mid=left+(right-left)/2;
			if(num<mid*mid) {
				right=mid;
			}else {
				left=mid;
			}
			
		}return (int)left;
	}
}
