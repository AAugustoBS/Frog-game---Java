package Frogger.Control;

import Frogger.model.River;

public abstract class GameController extends Controller<River>{

    public GameController(River river){
        super(river);
    }
}
