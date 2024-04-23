package A1.Date02Feb24;

import java.util.Scanner;

public class TreasureRoomMedium {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] a= new int[N];
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		
		
		mediumTreasureRoom(a,N,W);
	}

	private static void mediumTreasureRoom(int[] a,int N, int target) {
		int i=0;
		boolean flag=false;
		while(i<N-3) {
			int j=i+1;
			while(j<N-2) {
				int k=j+1;
				while(k<N-1) {
					if(a[i]+a[j]+a[k]==target) {
						flag=true;
						System.out.println(i+1);
						System.out.println(j+1);
						System.out.println(k+1);
						break;
						
					}k++;
					
				}j++;
				if(flag) {
					break;
				}
				
			}i++;
			if(flag) {
				break;
			}
		}
		if(!flag) {
			System.out.println(-1);
		}
		
		
		
		
		
		
		
	}

}
