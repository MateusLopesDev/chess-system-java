package boardgame;

public abstract class Piece {
	protected Position position;
	private Board board;
	
	//Constructor
	public Piece(Board board) {
		this.board = board;
	}
	
	//Methods
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return false;
	}
	
	public boolean isThereAnyPossibleMove() {
		return false;
	}
	
	//Getters
	protected Board getBoard() {
		return board;
	}
	
}
