import java.util.Scanner;
import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.*;


public class Application {
	static boolean gameOver = false;
	static String currentPlayer = "White";
	 static Scanner scanner = new Scanner(System.in);
        static String input;
	@SuppressWarnings("unused")
	public static void main(String[] args) {	
		Bishop whiteBishop  = new Bishop(PieceColor.WHITE, 9, 2);
		King whiteKing      = new King(PieceColor.WHITE, 9, 3);
		Knight whiteKnight  = new Knight(PieceColor.WHITE, 9, 1);
		Pawn whitePawn      = new Pawn(PieceColor.WHITE, 8, 0);
		Pawn whitePawnTwo   = new Pawn(PieceColor.WHITE, 8, 1);
		Pawn whitePawnThree = new Pawn(PieceColor.WHITE, 8, 2);
		Pawn whitePawnFour  = new Pawn(PieceColor.WHITE, 8, 3);
		Pawn whitePawnFive  = new Pawn(PieceColor.WHITE, 8, 4);
		Queen whiteQueen    = new Queen(PieceColor.WHITE, 9, 4);
		Rook whiteRook      = new Rook(PieceColor.WHITE, 9, 0);
		Menu();
	}
	public static void Menu() {
		while(!gameOver){
            try {
                System.out.println(currentPlayer + "'s Turn:");
                System.out.println("M - Move a piece");
                System.out.println("Q - Quit game");
                System.out.println("R - Reset the game");
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("Q") || input.equalsIgnoreCase("QUIT")) {
                    gameOver = true;
                    System.out.println("<<<GAME HAS ENDED>>>");
                    continue;
                } else if (input.equalsIgnoreCase("R") || input.equalsIgnoreCase("RESTART")) {
                   
                    System.out.println("<<<GAME RESTARTED>>>");
                    continue;
                } else if (input.equalsIgnoreCase("M") || input.equalsIgnoreCase("MOVE")) {	                    
                	System.out.println("Move from: row, col");
                	input = scanner.nextLine();
                	System.out.println("You Selected:" + "Where do you want to move it: Row,Col");
                	input = scanner.nextLine();
                }
            }catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                System.out.println("Couldn't parse input.");
                e.printStackTrace();
            } catch (NullPointerException e) {
                System.out.println("NullPointerException,Good Luck Debugging");
                e.printStackTrace();
            }	       
        }
	 scanner.close();
	}
}
