package Frogger.Control;

import Frogger.Game;
import Frogger.gui.GUI;
import Frogger.model.River;

import java.io.IOException;

public class RiverController extends Controller{

    public RiverController(River river){
        super(river);
    }


    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
    }
}
