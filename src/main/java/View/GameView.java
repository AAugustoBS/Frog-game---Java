package View;

import Model.GameModel;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class GameView extends View{
    private final GameModel gameModel;
    public GameView(GameModel gameModel, Screen screen) {
        super(gameModel,screen);
        this.gameModel = gameModel;
    }

    @Override
    public void draw() throws IOException {
        graph.setBackgroundColor(TextColor.Factory.fromString("#EECD40"));
        graph.putString(0,5,"O");
        getScreen().refresh();
    }
}
