package oop.parcial2.neighborhood;

public class LivingRoomBuilder {
    private int windows;
    private boolean tv;
    private boolean  homeTheater;
    private int width;
    private int height;
    private String color;

    public LivingRoomBuilder windows(int windows){
        this.windows=windows;
        return this;
    }
    public LivingRoomBuilder tv(boolean tv){
        this.tv=tv;
        return this;
    }
    public LivingRoomBuilder homeTheater(boolean homeTheater){
        this.homeTheater=homeTheater;
        return this;
    }
    public LivingRoomBuilder width(int width){
        this.width=width;
        return this;
    }

    public LivingRoomBuilder height(){
        this.height=height;
        return this;
    }
    public LivingRoomBuilder color(){
        this.color=color;
        return this;
    }
    public LivingRoom build(){
        return new LivingRoom(windows,tv,homeTheater,width,height,color);
    }
}
