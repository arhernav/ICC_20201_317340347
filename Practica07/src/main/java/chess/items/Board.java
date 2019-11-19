package chess.items;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.chessPieces.Empty;
import chess.pieces.chessPieces.Rook;
import chess.pieces.chessPieces.Queen;
import chess.pieces.chessPieces.Bishop;
import chess.pieces.chessPieces.Pawn;
import chess.pieces.chessPieces.King;

/**
 *Class that models a chess board
 *@author:ICC 2020-2
 *@date:16/nov/2019
 */

public class Board{
    //Parameters
    public int SIZE = 8;
    public Piece[][] matrix;
    private static Board instance = null;

    /**
     *Class builder
     */
    private Board(){
        this.matrix = new Piece[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.matrix[i][j] = new Empty(new Position(i, j), ColorEnum.NONE);
            }
        }
        this.matrix[0][0] = new Rook(new Position(0, 0), ColorEnum.BLACK);
	this.matrix[2][0] = new Bishop(new Position(2, 0), ColorEnum.BLACK);
	this.matrix[4][0] = new Queen(new Position(4, 0), ColorEnum.BLACK);
	this.matrix[3][0] = new King(new Position(3, 0), ColorEnum.BLACK);
	this.matrix[5][0] = new Bishop(new Position(5, 0), ColorEnum.BLACK);
        this.matrix[7][0] = new Rook(new Position(7, 0), ColorEnum.BLACK);
	this.matrix[0][1] = new Pawn(new Position(0, 1), ColorEnum.WHITE);
	this.matrix[1][1] = new Pawn(new Position(1, 1), ColorEnum.WHITE);
	this.matrix[2][1] = new Pawn(new Position(2, 1), ColorEnum.WHITE);
	this.matrix[3][1] = new Pawn(new Position(3, 1), ColorEnum.WHITE);
	this.matrix[4][1] = new Pawn(new Position(4, 1), ColorEnum.WHITE);
	this.matrix[5][1] = new Pawn(new Position(5, 1), ColorEnum.WHITE);
	this.matrix[6][1] = new Pawn(new Position(6, 1), ColorEnum.WHITE);
	this.matrix[7][1] = new Pawn(new Position(7, 1), ColorEnum.WHITE);
    }

    /**
     *This methods checks to see if an objet of the class already exists. If theres no object of the class, the method creates a new board
     */
    public static Board getInstance(){
        if(instance == null)
            instance = new Board();
        return instance;
    }

    /**
     *This method returns the size of the board
     *@return:Returns the size of the board
     */
    public int getSize(){
        return this.SIZE;
    }

    /**
     *Returns the piece of a selected position
     *@param:An object of the class position
     *@return:An object descendant of the class piece
     */
    public Piece getPiece(Position p){
        return this.matrix[p.getX()][p.getY()];
    }


    /**
     *this method shows the board and the pieces contained inside it
     *@return:Returns the board coonverted to String
     */
    @Override
    public String toString(){
        String result = "";
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                result += " "+ this.matrix[i][j]+" ";
            }
            result += '\n';
        }
        return result;
    }

}
