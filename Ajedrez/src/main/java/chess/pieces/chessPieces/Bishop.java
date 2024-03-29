package chess.pieces.chessPieces;
import java.util.LinkedList;
import java.util.List;
import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;

/**
 *Class that models the Bishop piece
 */

public class Bishop extends Piece{

    /**
     *Class  that models the Bishop piece
     *@param:p object of the class position
     *@param:color Constant from ColorEnum
     */
    public Bishop(Position p, ColorEnum color){
	super(p, color);
	this.type = PiecesTypeEnum.BISHOP;
    }

    /**
     *Returns a list with the posible movements that the piece can make
     *@return:Returns a list with the legal moves of the piece
     */
    @Override
    public List<Position> getLegalMoves(){
	Board board = Board.getInstance();
        if (this.legalMoves == null) {
            this.legalMoves = new LinkedList<Position>();

	    //Diagonal upper rigth
	    for(int i = this.position.getX()+1, j = this.position.getY()+1; i < 8 && j < 8; i++, j++){
		Position nextLegalPosition = new Position(i, j);
                Piece piece = board.getPiece(nextLegalPosition);
                if(piece.getColor() == this.getColor())break;
                if(piece.getColor() != ColorEnum.NONE){
                    this.legalMoves.add(nextLegalPosition);
                    break;
                }
                this.legalMoves.add(nextLegalPosition);
	    }

	    //Diagonal upper left scrolling
	    for(int i = this.position.getX()-1, j = this.position.getY()+1; i>=0 && j<8; i--, j++){
		Position nextLegalPosition = new Position(i, j);
                Piece piece = board.getPiece(nextLegalPosition);
                if(piece.getColor() == this.getColor())break;
                if(piece.getColor() != ColorEnum.NONE){
                    this.legalMoves.add(nextLegalPosition);
                    break;
                }
                this.legalMoves.add(nextLegalPosition);
	    }
	    

	    //Diagonal down left
	    for(int i = this.position.getX()-1, j = this.position.getY()-1; i>=0 && j>=0; i--, j--){
		Position nextLegalPosition = new Position(i, j);
                Piece piece = board.getPiece(nextLegalPosition);
                if(piece.getColor() == this.getColor())break;
                if(piece.getColor() != ColorEnum.NONE){
                    this.legalMoves.add(nextLegalPosition);
                    break;
                }
                this.legalMoves.add(nextLegalPosition);
	    }
	    //Diagonal down rigth
	     for(int i = this.position.getX()+1, j = this.position.getY()-1; i<8 && j>=0; i++, j--){
		Position nextLegalPosition = new Position(i, j);
                Piece piece = board.getPiece(nextLegalPosition);
                if(piece.getColor() == this.getColor())break;
                if(piece.getColor() != ColorEnum.NONE){
                    this.legalMoves.add(nextLegalPosition);
                    break;
                }
                this.legalMoves.add(nextLegalPosition);
	     }

	}
	return this.legalMoves;
    }
    

    /**
     *Compares two objects to see if they are the same
     *@return:True if both objects are the same. False in any other case
     */
    @Override
    public boolean equals(Object obj){
	if (!(obj instanceof Bishop)) return false;

        Bishop t = (Bishop) obj;
        return (t.getColor() == this.getColor() && this.getPosition().equals(t.getPosition())) ? true : false;

    }

    
    
}
