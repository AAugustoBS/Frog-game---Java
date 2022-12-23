package Frogger.view;

import Frogger.gui.GUI;
import Frogger.model.Frogger;

public class FroggerView implements ObjectView<Frogger>{
    @Override
    public void draw(Frogger frog, GUI gui){
        gui.drawFrog(frog.getPosition());
    }
}
