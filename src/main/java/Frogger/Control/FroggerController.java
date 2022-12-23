package Frogger.Control;

import Frogger.Game;
import Frogger.gui.GUI;
import Frogger.model.Position;
import Frogger.model.River;



public class FroggerController extends GameController {

    public FroggerController(River river){
        super(river);
    }

    public void moveFrogLeft() {
        moveFrog(getModel().getFrog().getPosition().getLeft());
    }

    public void moveHeroRight() {
        moveFrog(getModel().getFrog().getPosition().getRight());
    }

    public void moveFrogUp() {
        moveFrog(getModel().getFrog().getPosition().getUp());
    }

    public void moveFrogDown() {
        moveFrog(getModel().getFrog().getPosition().getDown());
    }

    private void moveFrog(Position position) {

         if (!getModel().isWaterFall(position)) {
            if(!getModel().isCrocodile(position)){
                getModel().getFrog().setPosition(position);
            }
            else{
                getModel().getFrog().lossLife();
                getModel().getFrog().setPosition(new Position(10,19));
            }
        }

        else{
            getModel().getFrog().lossLife();
            getModel().getFrog().setPosition(new Position(10,19));
        }
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        if (action == GUI.ACTION.UP) moveFrogUp();
        if (action == GUI.ACTION.RIGHT) moveHeroRight();
        if (action == GUI.ACTION.DOWN) moveFrogDown();
        if (action == GUI.ACTION.LEFT) moveFrogLeft();
        if (action == GUI.ACTION.NONE){
                moveFrogLeft();
        }
    }

}
