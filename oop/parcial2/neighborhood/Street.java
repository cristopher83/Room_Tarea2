package oop.parcial2.neighborhood;
import com.sun.source.tree.Tree;

import java.util.*;

public class Street {

    private String name;
    private TreeMap<Integer,House> houses ; //OBJECT NOT REQUIRED


    //Constructor
    public Street(String name, TreeMap<Integer,House> houses)
    {
        this.name=name;
        this.houses=houses;
    }


    //Methods
    public TreeMap<Integer,House> getHouses() {
        return houses;
    }
    public void setHouses(TreeMap<Integer,House> houses) {
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
