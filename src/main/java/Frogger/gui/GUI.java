package Frogger.gui;

import Frogger.model.Position;

import java.io.IOException;

public interface GUI {

    void drawFrog(Position position);

    void clear();

    void refresh() throws IOException;
    void drawText(Position position, String text, String color);
    void drawFlow(Position position);
    void close() throws IOException;
    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE, QUIT, SELECT}
    ACTION getNextAction() throws IOException;
    void drawCrocodile(Position position);
    void drawFrogSon(Position position);
}
