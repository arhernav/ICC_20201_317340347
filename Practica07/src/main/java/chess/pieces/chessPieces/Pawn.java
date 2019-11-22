package chess.pieces.chessPieces;
import java.util.LinkedList;
import java.util.List;
import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;

/**
 *Class that models the Pawn piece
 */
public class Pawn extends Piece{
    /**
     *Class builder
     *@param:p Objct of te class postion
     *@param:color Constant from PiecesTypeEnum
     */
    public Pawn(Position p, ColorEnum color){
	super(p, color);
	this.type = PiecesTypeEnum.PAWN;
    }

     /**
     *Gives the legal moves of the piece
     *@return:Returns a list with the legal moves of the piece
     */
    @Override
    public List<Position> getLegalMoves() {
        Board board = Board.getInstance();
	this.legalMoves = new LinkedList<Position>();
	switch(this.getColor()){
	case WHITE:
	    Position nextLegalMoveW = new Position(this.position.getX(), this.position.getY()-1);
	    Position nextEatW1 = new Position(this.position.getX()+1, this.position.getY()-1);
	    Position nextEatW2 = new Position(this.position.getX()-1, this.position.getY()-1);
	    if(this.isAppendable(nextEatW1)== 0) this.legalMoves.add(nextEatW1);
	    if(this.isAppendable(nextEatW2)== 0) this.legalMoves.add(nextEatW2);
	    if(this.isAppendable(nextLegalMoveW)== 1) this.legalMoves.add(nextLegalMoveW);
	    break;
	case BLACK:
	    Position nextLegalMoveB = new Position(this.position.getX(), this.position.getY()+1);
	    Position nextEatB1 = new Position(this.position.getX()+1, this.position.getY()+1);
	    Position nextEatB2 = new Position(this.position.getX()-1, this.position.getY()+1);
	    if(this.isAppendable(nextEatB1)== 0) this.legalMoves.add(nextEatB1);
	    if(this.isAppendable(nextEatB2)== 0) this.legalMoves.add(nextEatB2);
	    if(this.isAppendable(nextLegalMoveB) == 1)this.legalMoves.add(nextLegalMoveB);
	    break;
	default:
	    break;
	}
	
	return this.legalMoves;
    }



    /**
     *Compares two objects to see if they are equals
     *@param:Recives an object
     *@return:Returns true if both objects are equals, false in any other case
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pawn))
            return false;

        Pawn t = (Pawn) obj;
        return (t.getColor() == this.getColor() 
                && this.getPosition().equals(t.getPosition())) ? true : false;

    }
    
    
}
