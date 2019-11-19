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
	if(this.legalMoves == null){
	    this.legalMoves = new LinkedList<Position>();
	    
	    switch(this.getColor()){
		//Black pawn
	    case BLACK:
		if(this.position.getY() == 1){
		    Position nextLegalPosition = new Position(this.position.getX(), this.position.getY()+2);
		    if (nextLegalPosition.isOutOfBoard(8))break;
		    if (this.isAppendable(nextLegalPosition) == -1)break;
		    if (this.isAppendable(nextLegalPosition) == 0){
			this.legalMoves.add(nextLegalPosition);
			break;
		    }
			this.legalMoves.add(nextLegalPosition);
		}
		
		Position nextLegalPosition = new Position(this.position.getX(), this.position.getY()+1);
		if (nextLegalPosition.isOutOfBoard(8))break;
		if (this.isAppendable(nextLegalPosition) == -1)break;
		if (this.isAppendable(nextLegalPosition) == 0){
		    this.legalMoves.add(nextLegalPosition);
		    break;
		}
		this.legalMoves.add(nextLegalPosition);
		break;

	    case WHITE:
		if(this.position.getY() == 6){
		    Position nextLegalPosition2 = new Position(this.position.getX(), this.position.getY()-2);
		    if (nextLegalPosition2.isOutOfBoard(8))break;
		    if (this.isAppendable(nextLegalPosition2) == -1)break;
		    if (this.isAppendable(nextLegalPosition2) == 0){
			this.legalMoves.add(nextLegalPosition2);
			break;
		    }
			this.legalMoves.add(nextLegalPosition2);
		}
		
		Position nextLegalPosition2 = new Position(this.position.getX(), this.position.getY()-1);
		if (nextLegalPosition2.isOutOfBoard(8))break;
		if (this.isAppendable(nextLegalPosition2) == -1)break;
		if (this.isAppendable(nextLegalPosition2) == 0){
		    this.legalMoves.add(nextLegalPosition2);
		    break;
		}
		this.legalMoves.add(nextLegalPosition2);
		break;
		
	    }//Switch
	}//legal moves null
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
