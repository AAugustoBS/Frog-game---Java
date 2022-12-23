package Frogger.model;

public class River {
    private final int width;
    private final int height;

    private Frogger frog;

    public River(int width,int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Frogger getFrog(){
        return frog;
    }
}
