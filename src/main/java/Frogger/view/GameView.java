package Frogger.view;

import Frogger.gui.GUI;
import Frogger.model.Position;
import Frogger.model.River;

import java.util.List;

public class GameView extends View<River>{
    public GameView(River river){
        super(river);
    }

    @Override
    public void drawObjects(GUI gui){
        gui.drawText(new Position(0, 0), "Life: " + getModel().getFrog().getLife(), "#FFD700");

            drawObjects(gui,getModel().getFlows(),new FlowView());
            drawObjects(gui,getModel().getCrocodiles(),new CrocodileView());
            drawObject(gui,getModel().getFrog(),new FroggerView());
            drawObject(gui,getModel().getFrogSon(),new FrogSonView());


    }

    private <T extends Object> void drawObject(GUI gui,T object,ObjectView<T> view){
        view.draw(object,gui);
    }

    private <T extends Object> void drawObjects(GUI gui, List<T> objects, ObjectView<T> view){
        for(T object : objects){
            drawObject(gui,object,view);
        }
    }
}
