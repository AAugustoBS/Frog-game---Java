package Frogger.view;

import Frogger.gui.GUI;
import Frogger.model.Menu;
import Frogger.model.Position;

public class MenuView extends View<Menu>{
    public MenuView(Menu menu){
        super(menu);
    }

    @Override
    public void drawObjects(GUI gui){
        for(int option = 0; option < getModel().getNumberSelected();option++){
            gui.drawText(new Position(2,3+option), getModel().getEntry(option),getModel().isSelected(option) ? "#FFD700" : "#FFFFFF" );
        }
    }
}
