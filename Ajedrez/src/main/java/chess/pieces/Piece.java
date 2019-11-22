package chess.pieces;
import java.util.List;
import chess.items.Board;
import chess.items.Position;
/**
 *Abstract class that models a piece for the game.Every other piece in the game extends from this class
 *@author: Lab ICC 2020-1
 */
public abstract class Piece{
    protected Position position;
    protected List<Position> legalMoves = null;
    protected PiecesTypeEnum type;
    protected ColorEnum color;
    protected Board board;

    /**
     *Class builder
     *@param:p Object from the class Position
     *@param:color Constant from ColorEnum
     */
    public Piece(Position p, ColorEnum color) {
        this.position = p;
        this.color = color;
    }


    /**
     *Method used to know if a piece can move to a certain position
     *@param:p Object from the class Position
     *@return:the method returns the integer -1 if a piece from the same color exists in the selected position, 0 if a piece from the opposit color exists in the selected position or 1 if there is an empty piece in the selected position
     */
    public int isAppendable(Position p){
        Board board = Board.getInstance();
        Piece piece = board.getPiece(p);
        if(piece.getColor() == this.getColor())return -1;
        if(piece.getColor() != ColorEnum.NONE)return 0;
        return 1;
    }

    /**
     *Returns the position of the piece
     *@return:An object of the class position
     */
    public Position getPosition(){
        return this.position;
    }

    /**
     *Returns the color of the piece 
     *@return: Constant from ColorEnum
     */
    public ColorEnum getColor(){
        return this.color;
    }

    /**
     *Returns the type of the piece
     *@return:Constatn from PiecesTypeEnum
     */
    public PiecesTypeEnum getType(){
        return this.type;
    }

    /**
     *Moves the piece to a selected position
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
     *Abstract method
     *@return:Returns a list with the legal moves of the piece
     */
    public abstract List<Position> getLegalMoves();

    /**
     *Method that tellsyou if a certain move is inside the list of the legal moves of the piece
     *@return: true if the move is inside the list.False in any other case
     */
    public boolean isLegalMove(Position p) {
        List<Position> moves = this.getLegalMoves();
        return (moves.contains(p)) ? true : false;
    }

    /**
     *Method that converts an object from this class to String
     *@return: Returns the object converted to String
     */
    @Override
    public String toString() {
        return this.type.toString();
    }

    /**
     *Method that compares anobject from the class Piece with any other object to see if they are the same
     *@return: Returns true if both objects are the same. False in any other case
     */
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Piece))return false;
        Piece p = (Piece)obj;
        if(p.getType().equals(this.type) && p.getColor().equals(this.getColor()) && p.getPosition().equals(this.position))
        return true;
        return false;
    }
}
