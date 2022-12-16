package View;
import Model.Model;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public abstract class View<T extends Model> {
    protected T model;
    protected final Screen screen;
    protected TextGraphics graph;
    public View(T model,Screen screen ){
        this.screen = screen;
        graph = screen.newTextGraphics();
    }

    public abstract void draw() throws IOException;

    public Screen getScreen(){
        return this.screen;
    }
}
