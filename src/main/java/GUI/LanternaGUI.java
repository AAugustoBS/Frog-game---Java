package GUI;

import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.AWTTerminalFontConfiguration;
import com.googlecode.lanterna.terminal.swing.SwingTerminalFontConfiguration;

import java.awt.*;


public class LanternaGUI {
    Screen screen;
    protected TextGraphics graphics;

    public void createGameScreen(){
        try{
            Font font = new Font(Font.MONOSPACED, Font.PLAIN, 30);
            AWTTerminalFontConfiguration cfg = new SwingTerminalFontConfiguration(true, AWTTerminalFontConfiguration.BoldMode.NOTHING, font);
            Terminal terminal = new DefaultTerminalFactory().setInitialTerminalSize(new TerminalSize(20,10)).setTerminalEmulatorFontConfiguration(cfg).createTerminal();
            screen = new TerminalScreen(terminal);
            screen.setCursorPosition(null);   // We don't need a cursor
            screen.startScreen();             // Screens must be started
            screen.doResizeIfNecessary();     // Resize screen if necessary
            screen.clear();
            graphics=screen.newTextGraphics();
        } catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        };
    }


    public Screen getScreen(){
        return screen;
    }
}
