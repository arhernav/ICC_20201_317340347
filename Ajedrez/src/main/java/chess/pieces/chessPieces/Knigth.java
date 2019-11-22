package chess.pieces.chessPieces;
import java.util.LinkedList;
import java.util.List;
import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;

/**
 *Class that models the Knight piece
 *@date:18/nov/19
 */

public class Knigth extends Piece{

    /**
     *Class builder
     *@param:p Objct of te class postion
     *@param:color Constant from PiecesTypeEnum
     */
    public Knigth(Position p, ColorEnum color) {
        super(p,color);
        this.type = PiecesTypeEnum.KNIGTH;
    }

    /**
     *Gives the legal moves of the piece
     *@return:Returns a list of with the legal moves of the piece
     */
    @Override
    public List<Position> getLegalMoves() {
        Board board = Board.getInstance();
	this.legalMoves = new LinkedList<Position>();
	
	//Posible movements
	Position nextLegalPosition0 = new Position(this.position.getX()+2, this.position.getY()-1);
	Position nextLegalPosition1 = new Position(this.position.getX()+2, this.position.getY()+1);
	Position nextLegalPosition2 = new Position(this.position.getX()+1, this.position.getY()+2);
	Position nextLegalPosition3 = new Position(this.position.getX()-1, this.position.getY()+2);
	Position nextLegalPosition4 = new Position(this.position.getX()-2, this.position.getY()+1);
	Position nextLegalPosition5 = new Position(this.position.getX()-2, this.position.getY()-1);
	Position nextLegalPosition6 = new Position(this.position.getX()-1, this.position.getY()-2);
	Position nextLegalPosition7 = new Position(this.position.getX()+1, this.position.getY()-2);

	if(nextLegalPosition0.isOutOfBoard(8) && (this.isAppendable(nextLegalPosition0)==0 || this.isAppendable(nextLegalPosition0)==1 ))this.legalMoves.add(nextLegalPosition0);
	if(nextLegalPosition1.isOutOfBoard(8) && (this.isAppendable(nextLegalPosition1)==0 || this.isAppendable(nextLegalPosition1)==1 ))this.legalMoves.add(nextLegalPosition1);
	if(nextLegalPosition2.isOutOfBoard(8) && (this.isAppendable(nextLegalPosition2)==0 || this.isAppendable(nextLegalPosition2)==1 ))this.legalMoves.add(nextLegalPosition2);
	if(nextLegalPosition3.isOutOfBoard(8) && (this.isAppendable(nextLegalPosition3)==0 || this.isAppendable(nextLegalPosition3)==1 ))this.legalMoves.add(nextLegalPosition3);
	if(nextLegalPosition4.isOutOfBoard(8) && (this.isAppendable(nextLegalPosition4)==0 || this.isAppendable(nextLegalPosition4)==1 ))this.legalMoves.add(nextLegalPosition4);
	if(nextLegalPosition5.isOutOfBoard(8) && (this.isAppendable(nextLegalPosition5)==0 || this.isAppendable(nextLegalPosition5)==1 ))this.legalMoves.add(nextLegalPosition5);
	if(nextLegalPosition6.isOutOfBoard(8) && (this.isAppendable(nextLegalPosition6)==0 || this.isAppendable(nextLegalPosition6)==1 ))this.legalMoves.add(nextLegalPosition6);
	if(nextLegalPosition7.isOutOfBoard(8) && (this.isAppendable(nextLegalPosition7)==0 || this.isAppendable(nextLegalPosition7)==1 ))this.legalMoves.add(nextLegalPosition7);
	return this.legalMoves;
    }

    
    /**
     *Compares two objects to see if they are equals
     *@param:Recives an object
     *@return:Returns true if both objects are equals, false in any other case
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Knigth))
            return false;

        Knigth t = (Knigth) obj;
        return (t.getColor() == this.getColor() 
                && this.getPosition().equals(t.getPosition())) ? true : false;

    }
    
}
