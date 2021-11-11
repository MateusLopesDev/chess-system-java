package application;

import chess.ChessPiece;

public class UI {
	public static void printBoard(ChessPiece[][] pieces) {
		for (int i=0; i<pieces.length; i++) {
			System.out.print((i+1) + " ");
			for (int j=0; j<pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
			
			if (i == (pieces.length -1)) {
				System.out.print("  ");
				for (int j=0; j<pieces.length; j++) {
					System.out.print((char) (97 + j) + " ");
				}
			}
		}
	}
	
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");		
	}
}
