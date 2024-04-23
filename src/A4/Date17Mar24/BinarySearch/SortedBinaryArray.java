package A4.Date17Mar24.BinarySearch;

import java.util.Scanner;

public class SortedBinaryArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] numArray = new int[num];
		for(int i=0;i<num;i++) {
			numArray[i]=sc.nextInt();
		}
		int i=-1,j=num;
		while(i+1<j) {
			int mid=(i+j)/2;
			if(numArray[mid]==0 ) {
				i=mid;
			}
			else {
				j=mid;
			}
		}System.out.println(j+" "+i);
	}

}
