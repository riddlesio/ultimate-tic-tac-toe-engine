package com.theaigames.connectfour;

import com.theaigames.game.AbstractMove;
import com.theaigames.game.AbstractPlayer;

public class Disc {

	private int mColumn = 0, mRow = 0;
	
	public Disc(int column, int row) {
		mColumn = column; mRow = row;
	}

	
	/**
	 * @return : Column of move
	 */
	public int getColumn() {
		return mColumn;
	}
	
	/**
	 * @return : Row of move
	 */
	public int getRow() {
		return mRow;
	}
}
