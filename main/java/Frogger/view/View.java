package Frogger.view;

import Frogger.gui.GUI;

import java.io.IOException;

public abstract class View<T> {
    private final T model;

    public View(T model){
        this.model = model;
    }

    public T getModel(){
        return model;
    }

    public void draw(GUI gui) throws IOException {
        gui.clear();
        drawObjects(gui);
        gui.refresh();
    }

    protected abstract void drawObjects(GUI gui);

}
