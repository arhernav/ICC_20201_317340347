package chess.items;

/**
 *Class used to manage the position of a piece
 *@author:Lab ICC 2020-1
 *@date:16/Nov/2019
 */

public class Position{
    //Parameters
    private int x;
    private int y;

    /**
     *Class builder
     *@param: x Int that specifies the file of the pice
     *@param: y Int that specifies the column of the pieceo 
     */
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     *Method that compares two objects
     *@param:Any object
     */
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Position))return false;
        Position p = (Position)obj;
        return (p.getX()==this.getX() && p.getY()== this.getY())? true: false;
    }

    /**
     *Gives the position converted to String
     */
    @Override
    public String toString() {
        return "  ||x:"+this.getX()+" y:"+this.getY()+"||";
    }

    /**
     *Method that returns false if the position is out of board,true in other case
     *@param:int Determies the board size
     */
    public boolean isOutOfBoard(int board_size){
        if(this.y >= board_size)return false;
        if(this.x >= board_size)return false;
        if(this.y < 0)return false;
        if(this.x < 0)return false;
        return true;
    }
}
