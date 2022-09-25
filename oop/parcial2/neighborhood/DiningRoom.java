package oop.parcial2.neighborhood;

public class DiningRoom {
    private int windows;
    private boolean tv;
    private int width;
    private int height;
    private String color;
    private int chairsCapacity;

    //Constructor
    public DiningRoom(int windows,int height,String color,int width,boolean tv, int chairsCapacity){
        this.windows=windows;
        this.color=color;
        this.tv=tv;
        this.height=height;
        this.width=width;
        this.chairsCapacity=chairsCapacity;
    }

    //Methods
    public int getWindows()
    {
        return windows;
    }
    public void setWindows(int windows)
    {
        this.windows = windows;
    }
    public boolean getTv()
    {
        return tv;
    }
    public void getTv(boolean tv)
    {
        this.tv=tv;
    }
    public int getWidth()
    {
        return width;
    }
    public void setWidth(int width)
    {
        this.width=width;
    }
    public int getHeight()
    {
        return height;
    }
    public void setHeight(int height)
    {
        this.height=height;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public int getChairsCapacity()
    {
        return chairsCapacity;
    }
    public void setChairsCapacity(int chairsCapacity)
    {
        this.chairsCapacity = chairsCapacity;
    }

    //Builder
    public static DiningRoomBuilder builder(){
        return new DiningRoomBuilder();
    }
}
