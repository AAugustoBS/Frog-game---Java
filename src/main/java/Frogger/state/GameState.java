package Frogger.state;

import Frogger.Control.Controller;
import Frogger.Control.RiverController;
import Frogger.model.Menu;
import Frogger.model.River;
import Frogger.view.GameView;
import Frogger.view.View;

public class GameState extends State<River>{

    public GameState(River river){
        super(river);
    }

  @Override
    protected View<River> getView(){
        return new GameView(getModel());
  }

    @Override
    protected Controller<River> getController() {
        return new RiverController(getModel());
    }


}
