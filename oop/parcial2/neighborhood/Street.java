package oop.parcial2.neighborhood;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Street {

    private String name;
    private List <House> houses ; //OBJECT NOT REQUIRED


    //Constructor
    public Street(String name, List<House> houses)
    {
        this.name=name;
        this.houses=houses;
    }


    //Methods
    public List<House> getHouses() {
        return houses;
    }
    public void setHouses(List<House> houses) {
        this.houses = houses;
    }
    public String getName()
    {
        return name;
    }
    public  void setName(String name)
    {
        this.name=name;
    }
        //New methods
    //public House getHouse(int number){return houses.get(number);}
    //public void setHouse(House house,int number){houses.add(number,house);}

    //Builder

    public static StreetBuilder builder(){
        return new StreetBuilder();
    }
}
