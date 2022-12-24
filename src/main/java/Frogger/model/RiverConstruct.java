package Frogger.model;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class RiverConstruct {
    River river;

    public  RiverConstruct(){
        this.river = new River(20,20);

        river.setFrogger(createFrog());
        river.setCrocodiles(createCrocodiles());
        river.setFlows(createFlow());
        river.setFrogSon(createFrogSon());
    };

    public River getRiver(){
        return this.river;
    }
    private Frogger createFrog(){
        return new Frogger(10,18);
    }
    private FrogSon createFrogSon(){
        return new FrogSon(10,0);
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

    private List<Crocodile> createCrocodiles(){
        List<Crocodile> crocodiles = new ArrayList<>();
        SplittableRandom random = new SplittableRandom();
        for(int y = 2;y< 17;y++){
           for(int x = 0;x<20;x++){
               boolean probablyFalse = random.nextInt(15) == 0;
               if(probablyFalse){
                   crocodiles.add(new Crocodile(x,y));
               }
           }
       }

        return crocodiles;
    }
}
