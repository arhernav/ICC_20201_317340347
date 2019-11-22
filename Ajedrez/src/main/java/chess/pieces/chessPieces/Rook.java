package chess.pieces.chessPieces;

import java.util.LinkedList;
import java.util.List;

import chess.items.Board;
import chess.items.Position;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.PiecesTypeEnum;
/**
 *Class that models the rook piece
 */

public class Rook extends Piece {

    /**
     *Class builder
     */
    public Rook(Position p, ColorEnum color) {
        super(p, color);
        this.type = PiecesTypeEnum.ROOK;
    }

    /**
     *Method that returns a list with the posible movements of the piece
     *@return:Returns a list with the legal moves of the piece
     */
    public List<Position> getLegalMoves() {
        Board board = Board.getInstance();
        this.legalMoves = new LinkedList<Position>();
        for (int i = this.position.getX() + 1; i < 8; i++) {
            Position nextLegalPosition = new Position(i, this.position.getY());
            if (this.isAppendable(nextLegalPosition) == -1)
                break;
            if (this.isAppendable(nextLegalPosition) == 0) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);
        }

        for (int i = this.position.getX() - 1; i >= 0; i--) {
            Position nextLegalPosition = new Position(i, this.position.getY());
            Piece piece = board.getPiece(nextLegalPosition);
            if (piece.getColor() == this.getColor())
                break;
            if (piece.getColor() != ColorEnum.NONE) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);

        }

        for (int i = this.position.getY() + 1; i < 8; i++) {
            Position nextLegalPosition = new Position(this.position.getX(), i);
            Piece piece = board.getPiece(nextLegalPosition);
            if (piece.getColor() == this.getColor())
                break;
            if (piece.getColor() != ColorEnum.NONE) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);

        }

        for (int i = this.position.getY() - 1; i >= 0; i--) {
            Position nextLegalPosition = new Position(this.position.getX(), i);
            Piece piece = board.getPiece(nextLegalPosition);
            if (piece.getColor() == this.getColor())
                break;
            if (piece.getColor() != ColorEnum.NONE) {
                this.legalMoves.add(nextLegalPosition);
                break;
            }
            this.legalMoves.add(nextLegalPosition);

        }

        return this.legalMoves;
    }

}
