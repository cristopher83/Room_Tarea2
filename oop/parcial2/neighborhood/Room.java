package oop.parcial2.neighborhood;

public class Room {
    private int witdth;
    private int heigth;
    private String color;

    //Constructor.
    Room(int witdth,int heigth,String color){
        this.witdth=witdth;
        this.heigth=heigth;
        this.color=color;
    }
    //Methods.
    public int getWitdt(){
        return witdth;
    }
    public void setWitdth(int witdth){
        this.witdth=witdth;
    }
    public int getHeigth(){
        return heigth;
    }
    public void setHeigth(int heigth){
        this.heigth=heigth;
    }
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color=color;
    }
}
