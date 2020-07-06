package com.sudoku.logic;

import com.sudoku.constants.SudokuConstants;

public class ComputationLogic {

	// Here I am checking if the number is in column
	private boolean isNumberPresentInRow(int myArray[][], int row, int number) {
		for (int i = 0; i < SudokuConstants.SUDOKU_SIZE; i++)
			if (myArray[row][i] == number) {
				return true;
			}
		return false;
	}

	// Here I am checking if the number is already in Column
	private boolean isNumberPresentInCol(int myArray[][], int col, int number) {
		for (int i = 0; i < SudokuConstants.SUDOKU_SIZE; i++)
			if (myArray[i][col] == number) {
				return true;
			}
		return false;
	}

	// Here I am checking if the digit is in inner grid
	private boolean isNumberPresentInInnerGrid(int myArray[][], int row, int col, int number) {
		int r = row - row % 3; // I am taking subtracting mod 3 value of row and column
		int c = col - col % 3;//from my actual row and column value 
	                          // so I can get my inner grid row and column values when I add 3 to them	

		for (int i = r; i < r + 3; i++)
			for (int j = c; j < c + 3; j++)
				if (myArray[i][j] == number) {
					return true;
				}

		return false;
	}

	// combined method to check if a number possible to a row,col position is ok
		public boolean checkValidity(int myArray[][], int row, int col, int digit) {
			if (digit > 0 && digit <= 9) {
				return !isNumberPresentInRow(myArray, row, digit) && !isNumberPresentInCol(myArray, col, digit)
						&& !isNumberPresentInInnerGrid(myArray, row, col, digit);
			} else {
				System.out.println("Please insert digits 1 to  9 only");
				return false;
			}
		}

	public void display(int arr[][]) {
		for (int i = 0; i < SudokuConstants.SUDOKU_SIZE; i++) {
			for (int j = 0; j < SudokuConstants.SUDOKU_SIZE; j++) {
				System.out.print(" " + arr[i][j]);
			}

			System.out.println();
		}

		System.out.println();
	}

}
