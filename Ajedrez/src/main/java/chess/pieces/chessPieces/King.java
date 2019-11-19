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
        if (this.legalMoves == null) {
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

	    Position[] movements = new Position[8];
	    movements[0] = nextLegalMove0;
	    movements[1] = nextLegalMove1;
	    movements[2] = nextLegalMove2;
	    movements[3] = nextLegalMove3;
	    movements[4] = nextLegalMove4;
	    movements[5] = nextLegalMove5;
	    movements[6] = nextLegalMove6;
	    movements[7] = nextLegalMove7;
	    
	    //Adding the posible positions to the list
	    for(int i = 0; i<8; i++){
		if(!(movements[i].isOutOfBoard(8))){
		    if (this.isAppendable(movements[i]) == -1)break;
		    if (this.isAppendable(movements[i]) == 0){
			this.legalMoves.add(movements[i]);
			break;
		    }
		    legalMoves.add(movements[i]);   
		}
	    }   
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
        if (!(obj instanceof King))
            return false;

        King t = (King) obj;
        return (t.getColor() == this.getColor() 
                && this.getPosition().equals(t.getPosition())) ? true : false;

    }

}