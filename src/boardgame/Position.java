package boardgame;

public class Position {
	private int row;
	private int column;
	
	//Constructors	
	public Position() {
		
	}
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	//Methods	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	//Getters
	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}	
}
