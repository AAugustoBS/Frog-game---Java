package Frogger;


import Frogger.gui.LanternaGUI;
import Frogger.model.River;
import Frogger.state.GameState;
import Frogger.state.State;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class Game {
    private final LanternaGUI gui;
    private State state;

    public Game() throws IOException, URISyntaxException, FontFormatException {
        this.gui = new LanternaGUI(20,20);
        this.state = new GameState(new River(20,20));
    }

    public static void main(String[] args) throws IOException, URISyntaxException, FontFormatException {
        new Game().run();
    }

    private void run() throws IOException {
        int FPS = 10;
        int frameTime = 1000/FPS;

        while(this.state != null){
            long initialTime = System.currentTimeMillis();

            state.step(this,gui,initialTime);
            long elapsedTime = System.currentTimeMillis() - initialTime;
            long sleepTime = frameTime - elapsedTime;
            try {
                if (sleepTime > 0) Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
            }
        }
        gui.close();
        }


    }



