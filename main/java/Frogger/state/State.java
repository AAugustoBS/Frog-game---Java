package Frogger.state;

import Frogger.Game;
import Frogger.gui.GUI;
import Frogger.view.View;

import java.io.IOException;

public abstract class State<T>{

    private final T model;
    private final View<T> view;
    public State(T model){
        this.model = model;
        this.view = getView();

    }

    public void step(Game game, GUI gui, long time) throws IOException {
        //GUI.ACTION action = Frogger.gui.getNextAction();
        //controller.step(game, action, time);
        view.draw(gui);
    }

    protected abstract View<T> getView();
    public T getModel(){
        return model;
    }

}
