package Frogger.view;

import Frogger.gui.GUI;
import Frogger.model.Flow;

public class FlowView implements ObjectView<Flow>{
    @Override
    public void draw(Flow flow, GUI gui){
        gui.drawFlow(flow.getPosition());
    }
}
