package chess.pieces.chessPieces;
import java.util.LinkedList;
import java.util.List;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;
/**
 *Empty piece that fills the unused spaces on the board
 *@author:Lab ICC 2020-2
 *@date 16/Nov/2019
 */
public class Empty extends Piece{

    /**
     *Class builder
     *@param:p Object of the class position
     *@param:c Constant from the color enum
     */
    public Empty(Position p, ColorEnum c){
        super(p,c);
        this.type = PiecesTypeEnum.EMPTY;
    }

    /**
     *Class constructor
     */
    public Empty(){
        super(new Position(0,0),ColorEnum.NONE);
        this.type = PiecesTypeEnum.EMPTY;
    }

    /**
     *Gives the legal moves of the piece
     *@return:Returns a list that has all the legal moves of the piece
     */
    @Override
    public List<Position> getLegalMoves() {
        return new LinkedList<>();
    }

    /**
     *Compares two objects
     *@return:Return true if both objects are equal. False in any other case
     */
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Empty)? true: false;
    }

}
