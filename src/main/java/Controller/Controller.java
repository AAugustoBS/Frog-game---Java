package Controller;
import State.State;
public class Controller {
    State state;

    public Controller(){
    }


    public void run(){
        if(state == null){
            System.out.println("State is null");
        }
        else{
            System.out.println("System is not null");
        }
    }
}
