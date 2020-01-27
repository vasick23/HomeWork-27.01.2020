package com.chessmaster.pieces;

public class Pawn extends Piece{
	public Pawn(String color, int row, int col){
		super(color,row,col);		
		this.power = 1;
		this.id = 1;
	}
	
	public boolean isMoveActionValidForPawn(int moveRow, int moveCol) {
		int moveRowCoeficient = this.row - moveRow;
		int moveColCoeficient = this.col - moveCol;
		boolean isRowMoveValid = (moveRowCoeficient == 1);
		boolean isColMoveValid = (moveColCoeficient == 0);
		return isRowMoveValid && isColMoveValid;
	}
	
	public void renderPawn() {
		
	}

	@Override
	public void move(int moveRow, int moveCol) {
		if(isMoveActionValidForPawn(row, col)) {
			this.row = moveRow;
			this.col = moveCol;
		}
	}
	public boolean isAttackForPawn(int attackRow, int attackCol) {
		int attackRowCoeficient = this.row - attackRow;
		int attackColCoeficient = this.col - attackCol;
		boolean isRowAttackValid = (attackRowCoeficient == 1);
		boolean isColAttackValid = (attackColCoeficient <= 0);
		return isRowAttackValid && isColAttackValid;
	}
	@Override
	public void attack(int attackRow, int attackCol) {
		if(isAttackForPawn(attackRow, attackCol)) {
			this.row = attackRow;
			this.col = attackCol;
		}
	}

	@Override
	public void blast() {

	}
}