package A0.Date26Feb24;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		for(int i =0;i<num;i++) {
			System.out.println(reverseNum(sc.nextInt()));
			
		}
		
	}

	private static int reverseNum(int input) {
		int result=0;
		int rem=0;
		while(input>0) {
			rem=input%10;
			input=input/10;
			result=rem+(result*10);
		}
		return result;
	}

}
