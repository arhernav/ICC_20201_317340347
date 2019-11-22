package chess.items;
import chess.pieces.ColorEnum;
import chess.pieces.Piece;
import chess.pieces.chessPieces.Empty;
import chess.pieces.chessPieces.Rook;
import chess.pieces.chessPieces.Queen;
import chess.pieces.chessPieces.Bishop;

public class Board{
    public int SIZE = 8;
    public Piece[][] matrix;
    private static Board instance = null;
    private Board(){
        this.matrix = new Piece[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.matrix[i][j] = new Empty(new Position(i, j), ColorEnum.NONE);
            }
        }
        this.matrix[4][0] = new Rook(new Position(4, 0), ColorEnum.WHITE);
        this.matrix[7][0] = new Rook(new Position(7, 0), ColorEnum.BLACK);
        this.matrix[4][4] = new Rook(new Position(4, 4), ColorEnum.BLACK);
	this.matrix[6][6] = new Queen(new Position(6, 6), ColorEnum.BLACK);
	this.matrix[2][7] = new Bishop(new Position(2, 7), ColorEnum.WHITE);
        this.matrix[2][0] = new Bishop(new Position(2, 0), ColorEnum.BLACK);
    }

    public static Board getInstance(){
        if(instance == null)
            instance = new Board();
        return instance;
    }

    public int getSize(){
        return this.SIZE;
    }

    public void move(Position p, Position q){
        if(!p.isLegal() || !q.isLegal())return;
        Piece piece = this.getPiece(p);
        if(!piece.isLegalMove(q))return;
        piece.moveTo(q);
        this.matrix[p.getX()][p.getY()] = new Empty(p,ColorEnum.NONE);
        this.matrix[q.getX()][q.getY()] = piece; 
    }
    public Piece getPiece(Position p){
        //if(p.isOutOfBoard(SIZE))return null;
        return this.matrix[p.getX()][p.getY()];
    }


    public String toString(){
        String result = "";
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                result = " "+ this.matrix[i][j]+" "+result;
            }
            result += '\n';
        }
        return result;
    }

}
