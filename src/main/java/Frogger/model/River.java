package Frogger.model;

import java.util.List;

public class River {
    private final int width;
    private final int height;

    private Frogger frog;
    private List<Flow> flows;
    private List<Crocodile> crocodiles;
    private FrogSon frogSon;

    public River(int width,int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Frogger getFrog(){
        return frog;
    }

    public FrogSon getFrogSon() {
        return frogSon;
    }

    public void setFrogSon(FrogSon frogSon){
        this.frogSon = frogSon;
    }

    public void setFlows(List<Flow> flows) {
        this.flows = flows;
    }

    public List<Flow> getFlows() {
        return flows;
    }

    public boolean isWaterFall(Position position){
        if(position.getX() < 0){
            return true;
        }
        return false;
    }

    public void setCrocodiles(List<Crocodile> crocodiles){
        this.crocodiles = crocodiles;
    }

    public List<Crocodile> getCrocodiles(){
        return crocodiles;
    }

    public boolean isCrocodile(Position position) {
        for (Crocodile crocodile : crocodiles){
            if (crocodile.getPosition().equals(position)){

                return true;
            }

        }

        return false;
    }

    public boolean isSon(Position position){
        if(frogSon.getPosition().equals(position))
            return true;
        return false;
    }

    public boolean isRiver(Position position){
        for(Flow flow: flows)
            if (flow.getPosition().equals(position))
                return false;
        return true;

    }

    public void setFrogger(Frogger frog){
        this.frog = frog;
    }
}
