package oop.parcial2.neighborhood;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StreetBuilder {
    private String name;
    private List<House> houses = new ArrayList<>(); //OBJECT REQUIRED

    public StreetBuilder name(String name){
        this.name=name;
        return this;
    }
    public StreetBuilder house(int number,House house){
        this.houses.add(house);
        return this;
    }
    public Street build(){
        return new Street(name,houses);
    }
}
