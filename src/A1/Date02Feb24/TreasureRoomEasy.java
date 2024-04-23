package A1.Date02Feb24;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TreasureRoomEasy {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] a= new int[N];
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		
		
		easyTreasureRoom(a,W);
	}

	private static void easyTreasureRoom(int[] a, int target) {
		Map<Integer,Integer> hm= new HashMap<>();
		int[] ans = new int[2];
		boolean flag= false;
		for(int i=0;i<a.length;i++) {
			if(hm.containsKey(target-a[i])) {
				flag=true;
				System.out.print(hm.get(target-a[i])+1+" ");
				System.out.print(i+1);
				break;
			}else {
				hm.put(a[i], i);
			}
		}
		if(!flag) {
			System.out.println(-1);
		}
		
		
		
	}

}
