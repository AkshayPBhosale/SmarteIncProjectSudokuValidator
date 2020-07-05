package com.sudoku.game;

import com.sudoku.constants.SudokuConstants;
import com.sudoku.logic.ComputationLogic;

public class GameSudoku {
	
	public int[][] myGrid;//My sudoku answer grid
	
	//Here I am putting question grid values in my answer grid
	public GameSudoku(int[][] sudoku2DObj) {
		this.myGrid = new int[SudokuConstants.SUDOKU_SIZE][SudokuConstants.SUDOKU_SIZE];
		
		for (int i = 0; i < SudokuConstants.SUDOKU_SIZE; i++) {
			for (int j = 0; j < SudokuConstants.SUDOKU_SIZE; j++) {
				this.myGrid[i][j] = sudoku2DObj[i][j];
			}
		}
	}
	
		

}
