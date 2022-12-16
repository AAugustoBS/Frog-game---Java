package Model;

public class GameModel implements Model{
    //Deve ficar todos os personagens
    Frog frog;
    boolean isAlive;
    public GameModel(){
        frog = new Frog(new Position(2,3));
        isAlive = true;
    }

    public Frog getFrog(){
        return this.frog;
    }

    public boolean getAlive(){
        return this.isAlive;
    }
}
