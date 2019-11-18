package chess.pieces.chessPieces;
import java.util.LinkedList;
import java.util.List;
import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;

/**
 *Class for the rook piece
 *@author: Lab ICC 2020-2
 */

public class Rook extends Piece {
    /**
     *Class builder
     *@param:p Objct of te class postion
     *@param: color Constant from PiecesTypeEnum
     */
    public Rook(Position p, ColorEnum color) {
        super(p,color);
        this.type = PiecesTypeEnum.ROOK;
    }


    /**
     *Gives the legal moves of the piece
     *@return:Returns a list of with the legal moves of the piece
     */
    @Override
    public List<Position> getLegalMoves() {
        Board board = Board.getInstance();
        if (this.legalMoves == null) {
            this.legalMoves = new LinkedList<Position>();

	    //Rigth scrolling
            for(int i = this.position.getX()+1;i < 8; i++){
                Position nextLegalPosition = new Position(i, this.position.getY());
                if (this.isAppendable(nextLegalPosition) == -1)break;
                if (this.isAppendable(nextLegalPosition) == 0){
                    this.legalMoves.add(nextLegalPosition);
                    break;
                }
                this.legalMoves.add(nextLegalPosition);
                
            }

	    //Left scrolling
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

            //Downwards scrolling
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
        if (!(obj instanceof Rook))
            return false;

        Rook t = (Rook) obj;
        return (t.getColor() == this.getColor() 
                && this.getPosition().equals(t.getPosition())) ? true : false;

    }

}
