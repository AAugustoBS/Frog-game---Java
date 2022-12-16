package Controller;

import Model.Frog;
import Model.GameModel;

public class FrogController {
    private final GameModel gameModel;
    private final Frog frog;

    public FrogController(GameModel gameModel, Frog frog){
        this.frog = frog;
        this.gameModel = gameModel;
    }

    public Frog getFrog() {
        return frog;
    }


}
