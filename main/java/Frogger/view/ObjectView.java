package Frogger.view;

import Frogger.gui.GUI;

public interface ObjectView<T extends Object> {
    void draw(T object, GUI gui);
}
