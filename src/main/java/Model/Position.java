package Model;

public class Position {
    int col,row;

    public Position(int x, int y){
        this.col = x;
        this.row = y;
    }
    
    public int getCol(){
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
