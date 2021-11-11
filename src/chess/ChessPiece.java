package chess;

import boardgame.*;

public class ChessPiece extends Piece {
	private Color color;
	private int moveCount;
		
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
		this.moveCount = 0;
	}
	
	//Methods
	public ChessPosition getChessPosition () {
		return null;		
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		
		
		
		return false;
	}
	
	protected void increaseMoveCount() {
		this.moveCount += 1;
	}
	
	protected void decreaseMoveCount() {
		this.moveCount -= 1;
	}
	
	//Getters and Setters
	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}	
}
