package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ChessMatch partida = new ChessMatch();
		
		while(true) {
		UI.printBoard(partida.getPieces());
		System.out.println();
		System.out.print("print source: ");
		ChessPosition source = UI.readChessPosition(sc);
		System.out.println();
		System.out.print("target: ");
		ChessPosition target = UI.readChessPosition(sc);
		
		ChessPiece capturedPiece = partida.perfomChessMove(source, target);
		
		}
	}

}
