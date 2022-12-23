package Frogger.model;

import java.util.ArrayList;
import java.util.List;

public class RiverConstruct {
    River river;

    public  RiverConstruct(){
        this.river = new River(20,20);
        river.setFrogger(createFrog());
        river.setFlows(createFlow());

    };

    public River getRiver(){
        return this.river;
    }
    private Frogger createFrog(){
        return new Frogger(10,18);
    }
    private List<Flow> createFlow(){
        List<Flow> flows = new ArrayList<>();
        for(int y = 2;y<=20;y++){
            for(int x = 0;x<=20;x++){
                flows.add(new Flow(x,y));
            }
        }
        return flows;
    }

}
