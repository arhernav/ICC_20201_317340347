package chess.pieces.chessPieces;

import java.util.LinkedList;
import java.util.List;

import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;
/**
 *Clss that models the Queen piece
 *@date:18/nov/19
 */

public class Queen extends Piece{

    /**
     *Class builder
     *@param:p Object from the class Position
     *@param:color Constant from ColorEnum
     */
    public Queen(Position p, ColorEnum color){
    super(p, color);
    this.type = PiecesTypeEnum.QUEEN;
  }

    @Override
    public List<Position> getLegalMoves() {
        Board board = Board.getInstance();
        if (this.legalMoves == null) {
            this.legalMoves = new LinkedList<Position>();

	    
	    //Rigth scrolling
            for(int i = this.position.getX()+1;i <8; i++){
                Position nextLegalPosition = new Position(i, this.position.getY());
                if (this.isAppendable(nextLegalPosition) == -1)break;
                if (this.isAppendable(nextLegalPosition) == 0){
                    this.legalMoves.add(nextLegalPosition);
                    break;
                }
                this.legalMoves.add(nextLegalPosition);
                
            }

	    //Left Scrolling
            for(int i = this.position.getX()-1;i >= 0; i--){
                Position nextLegalPosition = new Position(i, this.position.getY());
                Piece piece = board.getPiece(nextLegalPosition);
                if(piece.getColor() == this.getColor())break;
                if(piece.getColor() != ColorEnum.NONE){
                    this.legalMoves.add(nextLegalPosition);
                    break;
                }
                this.legalMoves.add(nextLegalPosition);
               
            }

	    //Upwards scrolling
            for(int i = this.position.getY()+1;i < 8; i++){
                Position nextLegalPosition = new Position(this.position.getX(),i);
                Piece piece = board.getPiece(nextLegalPosition);
                if(piece.getColor() == this.getColor())break;
                if(piece.getColor() != ColorEnum.NONE){
                    this.legalMoves.add(nextLegalPosition);
                    break;
                }
                this.legalMoves.add(nextLegalPosition);
               
            }

            //Downwards Scrolling
            for(int i = this.position.getY()-1;i >= 0; i--){
                Position nextLegalPosition = new Position(this.position.getX(),i);
                Piece piece = board.getPiece(nextLegalPosition);
                if(piece.getColor() == this.getColor())break;
                if(piece.getColor() != ColorEnum.NONE){
                    this.legalMoves.add(nextLegalPosition);
                    break;
                }
                this.legalMoves.add(nextLegalPosition);
            }

	    //Diagonal upper right scrolling
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
     *Method that compares an object of the class Queen with any other kind of object. Returns true if they are completly equals, false in any other case
     *@param:obj Object of the class object
     *@return:Returns true if both objects are the same, false in any other case
     */
    @Override
    public boolean equals(Object obj){
	if (!(obj instanceof Queen)) return false;

        Queen t = (Queen) obj;
        return (t.getColor() == this.getColor() && this.getPosition().equals(t.getPosition())) ? true : false;

    }

}
