package com.sudoku.starter;

import com.sudoku.constants.SudokuConstants;
import com.sudoku.game.GameSudoku;
import com.sudoku.logic.ComputationLogic;

public class AppStarter {
	public static void main(String[] args) {
		//passing input question grid array in my gameSudoku constructor
		GameSudoku game = new GameSudoku(SudokuConstants.INPUT_GRID);
		System.out.println("Question Sudoku grid");
		ComputationLogic logic = new ComputationLogic();
		logic.display(game.myGrid);//I am displaying the grid here
		
		//Here after calling my checkValidity method I am displaying result on console 
		System.out.println("The output is :"+	logic.checkValidity(game.myGrid, 5,7, 4));
	
	
	}

}
