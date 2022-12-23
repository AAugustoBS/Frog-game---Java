package Frogger.model;

public class Frogger extends Objects{
    private int life;

    public Frogger(int x,int y){
        super(x,y);
        this.life = 3;
    }
    public void lossLife(){
        this.life--;
    }

    public int getLife(){
        return life;
    }

}
