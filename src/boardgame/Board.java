package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	//Constructor
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	//Methods
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public boolean positionExists(Position position) {
		return false;
	}
	
	public boolean thereIsAPiece(Position position) {
		if(pieces[position.getRow()][position.getColumn()] != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void placePiece(Piece piece, Position position) {
		
	}
	
	public void removePiece(Position position) {
		
	}
		
	//Getters and Setters
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
}
