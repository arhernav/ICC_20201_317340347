package chess.pieces.chessPieces;
import java.util.LinkedList;
import java.util.List;
import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;

/**
 *Class that models the King piece
 @date:18/nov/19
 */
public class King extends Piece{

    /**
     *Class builder
     *@param:p Objct of te class postion
     *@param: color Constant from PiecesTypeEnum
     */
    public King(Position p, ColorEnum color) {
        super(p,color);
        this.type = PiecesTypeEnum.KING;
    }

    /**
     *Gives the posible moves that the piece can do
     */
    @Override
    public List<Position> getLegalMoves() {
        Board board = Board.getInstance();
	this.legalMoves = new LinkedList<Position>();
	
	//King movements
	Position nextLegalMove0 = new Position(this.position.getX()+1, this.position.getY()-1);
	Position nextLegalMove1 = new Position(this.position.getX()+1, this.position.getY());
	Position nextLegalMove2 = new Position(this.position.getX()+1, this.position.getY()+1);
	Position nextLegalMove3 = new Position(this.position.getX(), this.position.getY()+1);
	Position nextLegalMove4 = new Position(this.position.getX(), this.position.getY()-1);
	Position nextLegalMove5 = new Position(this.position.getX()-1, this.position.getY()-1);
	Position nextLegalMove6 = new Position(this.position.getX()-1, this.position.getY());
	Position nextLegalMove7 = new Position(this.position.getX()-1, this.position.getY()+1);
	

	if(nextLegalMove0.isOutOfBoard(8) && (this.isAppendable(nextLegalMove0) == 0 || this.isAppendable(nextLegalMove0) == 1 )) this.legalMoves.add(nextLegalMove0);
	if(nextLegalMove1.isOutOfBoard(8) && (this.isAppendable(nextLegalMove1) == 0 || this.isAppendable(nextLegalMove1) == 1 )) this.legalMoves.add(nextLegalMove1);
	if(nextLegalMove2.isOutOfBoard(8) && (this.isAppendable(nextLegalMove2) == 0 || this.isAppendable(nextLegalMove2) == 1 )) this.legalMoves.add(nextLegalMove2);
	if(nextLegalMove3.isOutOfBoard(8) && (this.isAppendable(nextLegalMove3) == 0 || this.isAppendable(nextLegalMove3) == 1 )) this.legalMoves.add(nextLegalMove3);
	if(nextLegalMove4.isOutOfBoard(8) && (this.isAppendable(nextLegalMove4) == 0 || this.isAppendable(nextLegalMove4) == 1 )) this.legalMoves.add(nextLegalMove4);
	if(nextLegalMove5.isOutOfBoard(8) && (this.isAppendable(nextLegalMove5) == 0 || this.isAppendable(nextLegalMove5) == 1 )) this.legalMoves.add(nextLegalMove5);
	if(nextLegalMove6.isOutOfBoard(8) && (this.isAppendable(nextLegalMove6) == 0 || this.isAppendable(nextLegalMove6) == 1 )) this.legalMoves.add(nextLegalMove6);
	if(nextLegalMove7.isOutOfBoard(8) && (this.isAppendable(nextLegalMove7) == 0 || this.isAppendable(nextLegalMove7) == 1 )) this.legalMoves.add(nextLegalMove7);
	
	return this.legalMoves;
    }

    

    /**
     *Compares two objects to see if they are equals
     *@param:Recives an object
     *@return:Returns true if both objects are equals, false in any other case
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof King))
            return false;

        King t = (King) obj;
        return (t.getColor() == this.getColor() 
                && this.getPosition().equals(t.getPosition())) ? true : false;

    }

}
