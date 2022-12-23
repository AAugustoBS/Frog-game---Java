package Frogger.view;

import Frogger.gui.GUI;
import Frogger.model.FrogSon;

public class FrogSonView implements ObjectView<FrogSon> {

    @Override
    public void draw(FrogSon frogSon, GUI gui){
        gui.drawFrogSon(frogSon.getPosition());
    }
}
