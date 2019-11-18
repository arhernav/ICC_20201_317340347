package chess.pieces;
import java.util.List;
import chess.items.Board;
import chess.items.Position;

/**
 *Abstract class. Class with the basics atributes and methods from a piece
 *@author: Lab ICC 2020-1
 *@date:16/nov/2019
 */
public abstract class Piece{
    //Atributes
    protected Position position;
    protected List<Position> legalMoves = null;
    protected PiecesTypeEnum type;
    protected ColorEnum color;
    protected Board board;

    /**
     *Class builder
     *@param:p Object of the class position
     *@param:color Constant from ColorEnum
     */
    public Piece(Position p, ColorEnum color) {
        this.position = p;
        this.color = color;
    }

    
    public int isAppendable(Position p){
        Board board = Board.getInstance();
        Piece piece = board.getPiece(p);
        if(piece.getColor() == this.getColor())return -1;
        if(piece.getColor() != ColorEnum.NONE)return 0;
        return 1;
    }

    /**
     *Returns the position of the piece
     *@returns:Returns the position of the piece
     */
    public Position getPosition(){
        return this.position;
    }

    /**
     *Returns the color of the piece
     *@return: Returns the color of the piece
     */
    public ColorEnum getColor(){
        return this.color;
    }

    /**
     *Returns the type of the piece
     *@return:Returns the type of the piece
     */
    public PiecesTypeEnum getType(){
        return this.type;
    }

    /**
     *Moves the piece to a selected postion
     *@param: p Object of the class position
     */
    public void moveTo(Position p) {
        if (isLegalMove(p)) {
            this.position = p;
            this.legalMoves = null;
            return;
        } else
            return;
    }

    /**
     *List of the legal moves that the piece can make
     */
    public abstract List<Position> getLegalMoves();

    /**
     *Method that returns true if the given move is listed on the getLegalMoves list
     *@param: p Object of the class position
     *@return: Returns true if the given position is listed on the getLegalMoves list, false in any other case
     */
    public boolean isLegalMove(Position p) {
        List<Position> moves = this.getLegalMoves();
        return (moves.contains(p)) ? true : false;
    }

    /**
     *Returns the type of the piece
     *@return:Returns the type of the piece
     */
    @Override
    public String toString() {
        return this.type.toString();
    }

    /**
     *Abstract method
     *Compares two objects
     */
    @Override
    public abstract boolean equals(Object obj);

}
