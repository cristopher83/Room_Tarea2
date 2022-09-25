package oop.parcial2.neighborhood;
import java.util.ArrayList;
import java.util.List;

public class Neigborhood
{
    private List streets; //OBJECT NOT REQUIRED
    private int gardens;
    private boolean basketballCourt;
    private boolean footballCourt;
    private boolean swimmingPool;

    //Constructor
    public Neigborhood(List streets, int gardens, boolean basketballCourt, boolean footballCourt, boolean swimmingPool) {
        this.streets = streets;
        this.gardens = gardens;
        this.basketballCourt = basketballCourt;
        this.footballCourt = footballCourt;
        this.swimmingPool = swimmingPool;
    }


    //Methods
    public List getStreets() {return streets;}
    public void setStreets(List streets) {this.streets =streets;}
    public  int getGardens() {return gardens;}
    public void setGardens(int gardens) {this.gardens=gardens;}
    public boolean getBasket() {return basketballCourt;}
    public void setBasketballCourt(boolean basketballCourt) {this.basketballCourt=basketballCourt;}
    public boolean getFutBalCourt() {return footballCourt;}
    public void setFutBalCourt(boolean futBalCourt) {this.footballCourt=futBalCourt;}
    public boolean getSwimmingPool() {return swimmingPool;}
    public void setSwimmingPool(boolean swimmingPool) {this.swimmingPool=swimmingPool;}

   //Builder

   public static NeigborhoodBuilder builder(){
        return new NeigborhoodBuilder();
   }
}
