package A3.Date09Mar24;

import java.util.Scanner;

public class RotationAntiClockwise90 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int[][] a= new int[row][row];
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println(rotateAnti(a,row));

	}

private static int[] rotateAnti(int[][] a, int row) {
	
	for(int i=0;i<row;i++) {
		for(int j=0;j<i;j++) {
			int temp= a[i][j];
			a[i][j]=a[j][i];
			a[j][i]=temp;
		}
	}
	for(int i=0;i<row;i++) {
		for(int j=0;j<row/2;j++) {
			int temp = a[j][i];
			a[j][i]=a[row-1-j][i];
			a[row-1-j][i]=temp;
		}
	}
	for(int i=0;i<row;i++) {
		for(int j=0;j<row;j++) {
			System.out.print(a[i][j]+" ");
			}System.out.println();
			
		}
		
	
	return null;
}

}
