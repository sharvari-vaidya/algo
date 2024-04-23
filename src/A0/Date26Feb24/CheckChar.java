package A0.Date26Feb24;

import java.util.Scanner;

public class CheckChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

			System.out.println(checkChar(sc.next().charAt(0)));   
			
		}

	private static String checkChar(char charAt) {
		int asc= charAt;
		if((asc>96)&&(asc<123)) {
			return "lower";
		}else if((asc>64)&&(asc<91)) {
			return "upper";
		}else {
			return "error";
		}
	}

	
}
