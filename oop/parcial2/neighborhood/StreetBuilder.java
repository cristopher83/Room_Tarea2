package oop.parcial2.neighborhood;
import java.util.*;

public class StreetBuilder {
    private String name;
    private TreeMap<Integer,House> houses; //OBJECT REQUIRED

    public StreetBuilder(){
        houses=new TreeMap<>();
    }
    public StreetBuilder name(String name){
        this.name=name;
        return this;
    }
    public StreetBuilder house(int number,House house){
        houses.put(number,house);
        return this;
    }
    public Street build(){
        return new Street(name,houses);
    }
}
