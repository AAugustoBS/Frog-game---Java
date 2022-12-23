package Frogger.model;

import java.util.Arrays;
import java.util.List;

public class Menu {
    private int selected = 0;
    private final List<String> options;
    public Menu(){
        this.options = Arrays.asList("New Game","Quit");
    }

    public void chooseSelected(){
        selected++;

        if(selected > this.options.size() - 1){
            selected = 0;
        }
    }

    public void previousSelected() {
        selected--;
        if (selected < 0)
            selected = this.options.size() - 1;
    }

    public String getEntry(int i) {
        return options.get(i);
    }


    public boolean isSelected(int i) {
        return selected == i;
    }

    public boolean isSelectedExit() {
        return isSelected(1);
    }

    public boolean isSelectedStart() {
        return isSelected(0);
    }

    public int getNumberSelected() {
        return this.options.size();
    }

}
