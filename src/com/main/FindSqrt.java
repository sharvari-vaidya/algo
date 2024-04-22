package com.main;


public class FindSqrt {
	public static void main(String[] args) {
		int a= 101;
		double left=1,right=a;
		while(left+0.01<right) {
			double mid=left+(right-left)/2;
			if(mid*mid==a)
			{
				System.out.println(mid);
			System.exit(0);
			}
			if(predicate(mid,a)==0) {
				left=mid;
			}else {
				right=mid;
			}
		}System.out.println(left);
		
	}

	private static int predicate(double mid,int a) {
		if(mid*mid <=a) {
			return 0;
		}
		
		return 1;
	}

}
