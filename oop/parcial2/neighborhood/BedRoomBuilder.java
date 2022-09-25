package oop.parcial2.neighborhood;

public class BedRoomBuilder {

    private boolean tv;
    private int width;
    private int height;
    private String color;
    private BedSize bedSize;

    public BedRoomBuilder tv(boolean tv){
        this.tv=tv;
        return this;
    }
    public BedRoomBuilder width(int width){
        this.width=width;
        return this;
    }
    public BedRoomBuilder height(int height){
        this.height=height;
        return this;
    }
    public BedRoomBuilder color(String color){
        this.color=color;
        return this;
    }
    public BedRoomBuilder bedSize(BedSize bedSize){
        this.bedSize =bedSize;
        return this;
    }
    public BedRoom build(){
        return new BedRoom(tv,width,height,color, bedSize);
    }
}
