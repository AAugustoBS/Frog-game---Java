package Frogger.Control;

import Frogger.Game;
import Frogger.gui.GUI;
import Frogger.model.Menu;
import Frogger.model.River;
import Frogger.state.MenuState;

import java.io.IOException;

public class RiverController extends GameController{
    private final FroggerController frogController;
    public RiverController(River river){

        super(river);
        this.frogController = new FroggerController(river);
    }


    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (action == GUI.ACTION.QUIT || getModel().getFrog().getLife() == 0)
            game.setState(new MenuState(new Menu()));
        else {
            frogController.step(game, action, time);
            //monsterController.step(game, action, time);
        }
    }
}
