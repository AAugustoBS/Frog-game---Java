package Frogger.state;

import Frogger.Control.Controller;
import Frogger.Game;
import Frogger.gui.GUI;
import Frogger.view.View;

import java.io.IOException;

public abstract class State<T>{

    private final T model;
    private final View<T> view;
    private final Controller<T> controller;
    public State(T model){
        this.model = model;
        this.view = getView();
        this.controller = getController();

    }

    public void step(Game game, GUI gui, long time) throws IOException {
        GUI.ACTION action = gui.getNextAction();
        controller.step(game, action, time);
        view.draw(gui);
    }

    protected abstract Controller<T> getController();

    protected abstract View<T> getView();

    public T getModel(){
        return model;
    }

}
