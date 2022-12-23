package Frogger.model;

public class Frogger extends Objects{
    private int life;
    private boolean saveSon;

    public Frogger(int x,int y){
        super(x,y);
        this.life = 3;
        saveSon = false;
    }
    public void lossLife(){
        this.life--;
    }
    public void setSaveSon(boolean save){
        saveSon = save;
    }

    public boolean getSaveSon(){
        return saveSon;
    }
    public int getLife(){
        return life;
    }

}
