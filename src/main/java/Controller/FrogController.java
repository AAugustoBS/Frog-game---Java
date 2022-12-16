package Controller;

import Model.Frog;
import Model.GameModel;
import com.googlecode.lanterna.input.KeyStroke;

public class FrogController implements Observer{
    private final GameModel gameModel;
    private final Frog frog;

    public FrogController(GameModel gameModel, Frog frog){
        this.frog = frog;
        this.gameModel = gameModel;
    }

    public Frog getFrog() {
        return frog;
    }

    @Override
    public void processKey(KeyStroke key){
        switch(key.getKeyType()){
            case ArrowDown:
                frog.setCoordinates("s");
                break;
            case ArrowUp:
                frog.setCoordinates("w");
                break;
            case ArrowLeft:
                frog.setCoordinates("a");
                break;
            case ArrowRight:
                frog.setCoordinates("d");
                break;


        }
    }
}
