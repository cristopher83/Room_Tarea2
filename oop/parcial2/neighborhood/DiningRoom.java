package oop.parcial2.neighborhood;

public class DiningRoom extends Room{
    private int windows;
    private boolean tv;

    private int chairsCapacity;

    //Constructor
    public DiningRoom(int windows,int height,String color,int width,boolean tv, int chairsCapacity){
        super(width,height,color);
        this.windows=windows;
        this.tv=tv;
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
