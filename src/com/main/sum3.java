package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class sum3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int target = sc.nextInt();
		int[] a = new int[row];
		for (int i = 0; i < row; i++) {
				a[i] = sc.nextInt();
			}
		
		
		get3Sum(a, target);
		
	}

	private static void get3Sum(int[] a, int target) {
		Map<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(hm.containsKey(target-a[i]-a[j])) {
					System.out.println(hm.get(target-a[i]-a[j])+" "+(i+1)+" "+(j+1));
					System.exit(0);
				}
				
			}hm.put(a[i], i+1);
		}
	}

}
 