package A0.Date26Feb24;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println(countWords(sc.nextLine()));
			
		}

	private static int countWords(String input) {
		
		int result=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' ') {
				result++;
			}
		}
		
		
		return result+1;
	}
		


	
}
