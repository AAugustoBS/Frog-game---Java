package State;
import Controller.FrogController;
import Controller.Observer;
import GUI.LanternaGUI;
import Model.Frog;
import Model.GameModel;
import View.GameView;
import View.View;

import java.io.IOException;

public class GameState extends State{
    LanternaGUI gui;
    private GameView gameView;
    private GameModel gameModel;
    private long time, initialTime;
    private FrogController frogController;
    //frogger controller



    public GameState() throws IOException{
        super();
        gameModel = new GameModel();
        gui = new LanternaGUI();
        time = 0;
        initialTime = System.currentTimeMillis();
        frogController = new FrogController(gameModel,gameModel.getFrog());
        //frog controller
        //
    }
    @Override
    public void start(){

        gui.createGameScreen();
        gameView = new GameView(gameModel,gui.getScreen());
    }

    @Override
    public View getView(){
        return this.gameView;
    }

    @Override
    public void draw() throws IOException {
        time += System.currentTimeMillis() - initialTime;
        initialTime = System.currentTimeMillis();
        while(time >= 20){
            //see collision
            time -= 20;
        }

        gameView.draw();
    }
    @Override
    public Observer getObserver(){
        return (Observer) frogController;
    }

    @Override
    public boolean isAlive(){
        return gameModel.getAlive();
    }

}
