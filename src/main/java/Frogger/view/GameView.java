package Frogger.view;

import Frogger.gui.GUI;
import Frogger.model.Position;
import Frogger.model.River;

public class GameView extends View<River>{
    public GameView(River river){
        super(river);
    }

    @Override
    public void drawObjects(GUI gui){
            drawObjects(gui,getModel().getFrog(),new FroggerView());

    }

    private <T extends Object> void drawObjects(GUI gui,T object,ObjectView<T> view){
        view.draw(object,gui);
    }
}
