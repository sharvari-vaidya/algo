package com.main;

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		char[][] board = new char[3][3];
		intialiseBoard(board);
		Scanner sc = new Scanner(System.in);
		boolean checkWinner = false;
		for (int i = 0; i < board.length * board[0].length; i++) {
			printBoard(board);

			if (i % 2 == 0) {
				System.out.println("play your move player 1 your symbol is *");
				int row = sc.nextInt();
				int col = sc.nextInt();
				board[row][col] = '*';
				checkWinner = checkWinner('*', board);
				if (checkWinner) {
					System.out.println("you won player1");
					System.exit(0);
				}
			} else {
				System.out.println("play your move player 2your symbol is O");
				int row = sc.nextInt();
				int col = sc.nextInt();
				board[row][col] = 'O';
				checkWinner = checkWinner('O', board);
				if (checkWinner) {
					System.out.println("you won player1");
					System.exit(0);

				}
			}

		}
		if (!checkWinner) {
			System.out.println("game draw");
		}
	}

	private static void intialiseBoard(char[][] board) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = ' ';
			}
		}

	}

	private static boolean checkWinner(char c, char[][] board) {
		for (int i = 0; i < board.length; i++) {
			int count = 0;
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == c) {
					count++;
				}

			}
			if (count == 3)
				return true;
		}

		for (int i = 0; i < board.length; i++) {
			int count = 0;
			for (int j = 0; j < board[0].length; j++) {
				if (board[j][i] == c) {
					count++;
				}

			}
			if (count == 3)
				return true;
		}
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			if (board[i][i] == c) {
				count++;
			}
			if (count == 3)
				return true;
		}
		int rowCount = 0;
		int colCount = 2;
		int count1 = 0;
		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board[0].length; j++) {
				if (i == rowCount && j == colCount && board[i][j] == c) {
					count1++;
				}
			}
			rowCount++;
			colCount--;
			if (count1 == 3)
				return true;
		}
		return false;

	}

	private static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
		}

		System.out.println("------------------------");
	}
}
