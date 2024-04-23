package A3.Date09Mar24;

import java.util.Scanner;

public class SpiralMatrix {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] a= new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		int left=0,right=col-1,up=0,down=row-1;
		int count=1;
		
		while(left<=right && up <=down) {
			
			if(count%4==1) {
				for(int i=left;i<=right;i++) {
					System.out.print(a[up][i]+" ");
				}up++;
			}else if(count%4==2) {
				for(int i=up;i<=down;i++) {
					System.out.print(a[i][right]+" ");
				}right--;
			}else if(count%4==3) {
				for(int i=right;i>=left;i--) {
					System.out.print(a[down][i]+" ");
				}down--;
			}
			else if(count%4==0) {
				for(int i=down;i>=up;i--) {
					System.out.print(a[i][left]+" ");
				}left++;
			}
			count++;
		}
		

	}
// 4 5

// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20
}
