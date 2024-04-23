package A0.Date26Feb24;

import java.util.Scanner;

public class FactorialNum {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		for(int i =0;i<num;i++) {
			System.out.println(factorialNumRecursion(sc.nextInt()));
			
		}
		
	}

	private static int factorialNum(int inp) {
		int result=1;
		
		for(int i=1;i<=inp;i++) {
			result=result*i;
		}
		return result;
		
		
		
	}
	private static int factorialNumRecursion(int inp) {
		int result=1;
		
		if(inp==1) {
			return 1;
		}else {
			return inp*factorialNum(inp-1);
		}
		
		
		
	}
}
