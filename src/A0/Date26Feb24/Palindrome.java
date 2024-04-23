package A0.Date26Feb24;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		for(int i =0;i<num;i++) {
			System.out.println(findPalindrome(sc.nextInt()));
			
		}
		
	}

	
	
	private static String findPalindrome(int inp) {
		String s= String.valueOf(inp);
		boolean flag= false;
		for(int i=0;i<=s.length()/2;i++) {
			if(!(s.charAt(i)==s.charAt(s.length()-i-1))) {
				flag = true;
				break;
			}
		}
		
		
		return flag?"No":"Yes";
	}

}
