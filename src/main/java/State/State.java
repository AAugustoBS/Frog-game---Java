package State;

import Controller.Observer;
import View.View;

import java.io.IOException;

public abstract class State {
    public abstract void start();

    public abstract View getView();

    public abstract void draw() throws IOException;
    public abstract Observer getObserver();

    public abstract boolean isAlive();
}
