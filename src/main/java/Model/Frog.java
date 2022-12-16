package Model;

public class Frog {
    int lives;
   Position position;

    public Frog(Position position){
        this.position = position;
    }

    public void setCoordinates(String direction){
        switch (direction){
            case "w":
                position.setRow(position.getRow()+1);
                break;
            case "s":
                position.setRow(position.getRow()-1);
                break;
            case "a":
                position.setCol(position.getCol()-1);
                break;
            case "d":
                position.setRow(position.getCol()+1);
                break;
        }
    }

    public void update(long time){

    }

}
