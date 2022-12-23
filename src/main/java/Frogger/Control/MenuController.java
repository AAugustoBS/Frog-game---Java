package Frogger.Control;

import Frogger.Game;
import Frogger.gui.GUI;
import Frogger.model.Menu;
import Frogger.model.River;
import Frogger.model.RiverConstruct;
import Frogger.state.GameState;

import java.io.IOException;

public class MenuController extends Controller<Menu>{
    public MenuController(Menu menu){
        super(menu);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        switch (action) {
            case UP:
                getModel().previousSelected();
                break;
            case DOWN:
                getModel().chooseSelected();
                break;
            case SELECT:
                if (getModel().isSelectedExit()) game.setState(null);
                if (getModel().isSelectedStart()) game.setState(new GameState(new RiverConstruct().getRiver()));
        }
    }


}
