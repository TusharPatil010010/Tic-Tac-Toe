package com.capg.Workshop;

public class TicTacToeGame {

	public char[] tictactoe = new char[10];
	
	public void createBoard() {		
		
		for(int i = 1; i < tictactoe.length; i++ )
			tictactoe[i] = ' ';
	}
	
	public static void main(String[] args) {
		TicTacToeGame obj = new TicTacToeGame();
		obj.createBoard();
	}
}	
