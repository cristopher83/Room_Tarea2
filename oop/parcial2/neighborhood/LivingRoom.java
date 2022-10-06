package oop.parcial2.neighborhood;

public class LivingRoom extends Room{
    private int windows;
    private boolean tv;
    private boolean  homeTeather;


    //Constructor
    public LivingRoom(int windows, boolean tv, boolean homeTeather, int width, int height, String color) {
        super(width,height,color);
        this.windows = windows;
        this.tv = tv;
        this.homeTeather = homeTeather;
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
    public boolean getTeather()
    {
        return homeTeather;
    }
    public void getTeather(boolean homeTeather)
    {
        this.homeTeather=homeTeather;
    }

    //Builder

    public static LivingRoomBuilder builder(){
        return new LivingRoomBuilder();
    }
}
