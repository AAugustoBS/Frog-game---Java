package Controller;
import State.State;
import State.GameState;
import View.View;

import java.io.IOException;

public class Controller {
    State state;
    View view;
    final Thread thread;
    Keys readKeys;

    public Controller(){
        readKeys = new Keys();
        thread = new Thread(readKeys);

    }


    public void run() throws IOException {
        if(state == null){
            state = new GameState();
            state.start();
        }

        while(state != null){
            view = state.getView();
            readKeys.setScreen(view.getScreen());
            readKeys.addObserver(state.getObserver());
            while(state.isAlive())
                state.draw();

        }

    }
}
