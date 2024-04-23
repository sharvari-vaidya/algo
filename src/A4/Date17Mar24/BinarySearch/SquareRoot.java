package A4.Date17Mar24.BinarySearch;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double i=0,j=num;
		while(i+0.000001<j) {
			double mid=i+(j-i)/2;
			if(mid*mid==num) {
				System.out.println(mid);
				break;
			}else if(mid*mid<num){
				i=mid;
			}else {
				j=mid;
			}
		}System.out.println(i);
	}

}
