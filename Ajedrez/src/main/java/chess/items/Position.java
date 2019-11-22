package chess.items;
/**
 *Class that manages the position of the pieces
 */
public class Position{
    private int x;
    private int y;

    /**
     *Builder of the class
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
     *Method that tells you if a certain position is inside the board
     *@return:true if the given position is inside the board. False in any other case
     */
    public boolean isLegal(){
        return (this.x < 8 && this.x > -1 && this.y < 8 && this.y > -1 )? true: false;
    }
    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     *Method that compares a postion with other object to see if they are the same
     */
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Position))return false;
        Position p = (Position)obj;
        return (p.getX()==this.getX() && p.getY()== this.getY())? true: false;
    }

    /**
     *Returns the position converted to String
     */
    @Override
    public String toString() {
        return "  ||x:"+this.getX()+" y:"+this.getY()+"||";
    }

    /**
     *Method that tells you if a certain position is outside of the board limits
     *@return:False if the given position is outside of the board, True in any other case
     */
    public boolean isOutOfBoard(int board_size){
        if(this.y >= board_size)return false;
        if(this.x >= board_size)return false;
        if(this.y < 0)return false;
        if(this.x < 0)return false;
        return true;
    }
}
