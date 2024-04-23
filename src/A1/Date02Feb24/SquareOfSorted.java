package A1.Date02Feb24;


import java.util.*;
public class SquareOfSorted {
	
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int[] a=new int[num];
		for(int i =0;i<num;i++) {
			a[i]=sc.nextInt();
		}
		int[] ans=square(a);
		for(int i:ans){
		  System.out.print(i+" ");
		}
	}
		static int[] square(int[] a){
		     
			int[] ans = new int[a.length];
			int l = 0, r = a.length - 1;
			int count = a.length-1;
			while (l <= r) {
				if (Math.abs(a[l]) < Math.abs(a[r])) {
					ans[count] = a[r] * a[r];
					count--;
					r--;
				} else {
					ans[count] = a[l] * a[l];
					count--;
					l++;
				}

			}
			return ans;
	}

}
