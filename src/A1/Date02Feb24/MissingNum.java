package A1.Date02Feb24;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MissingNum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a= new int[num];
		for(int i=0;i<num;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(MissingNum(a,num));
	}

	private static int MissingNum(int[] a,int num) {
		
//		13
//		7 1 4 3 7 6 5 8 6 7 2 6 2
		
		Set<Integer> sw= new HashSet<>();
		for(int i=0;i<a.length;i++) {
			sw.add(a[i]);
		}
		for(int i=1;i<=num;i++) {
			if(!(sw.contains(i))){
				return i;
			}
		}
		return -1;
	}
	
	

}
