package Frogger.state;

import Frogger.Control.Controller;
import Frogger.Control.MenuController;
import Frogger.model.Menu;
import Frogger.view.MenuView;
import Frogger.view.View;

public class MenuState extends State<Menu>{

    public MenuState(Menu menu){
        super(menu);
    }

    @Override
    protected Controller<Menu> getController() {
        return new MenuController(getModel());
    }

    @Override
    protected View<Menu> getView() {
        return new MenuView(getModel());
    }

}
