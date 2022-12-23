package Frogger.gui;

import Frogger.model.Position;

import java.io.IOException;

public interface GUI {

    void drawFrog(Position position);

    void clear();

    void refresh() throws IOException;

    void close() throws IOException;


}
