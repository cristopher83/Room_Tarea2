package oop.parcial2.neighborhood;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NeigborhoodBuilder {
    private List streets  = new ArrayList(); //OBJECT REQUIRED
    private int gardens;
    private boolean basketballCourt;
    private boolean footballCourt;
    private boolean swimmingPool;

    public NeigborhoodBuilder streets(List streets){
        this.streets=streets;
        return this;
    }
    public NeigborhoodBuilder gardens(int gardens){
        this.gardens=gardens;
        return this;
    }
    public NeigborhoodBuilder basketballCourt(boolean basketballCourt){
        this.basketballCourt=basketballCourt;
        return this;
    }
    public NeigborhoodBuilder footBallCourt(boolean footballCourt){
        this.footballCourt=footballCourt;
        return this;
    }
    public NeigborhoodBuilder swimmingPool(boolean swimmingPool){
        this.swimmingPool=swimmingPool;
        return this;
    }

    //Build
    public Neigborhood build(){
        return new Neigborhood(streets,gardens,basketballCourt,footballCourt,swimmingPool);
    }
}
