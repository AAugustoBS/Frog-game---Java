package Frogger.view;

import Frogger.gui.GUI;
import Frogger.model.Crocodile;

public class CrocodileView implements ObjectView<Crocodile> {
    @Override
    public void draw(Crocodile crocodile, GUI gui){
        gui.drawCrocodile(crocodile.getPosition());
    }
}
