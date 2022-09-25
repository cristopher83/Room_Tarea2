package oop.parcial2.neighborhood;

public class LivingRoom {
    private int windows;
    private boolean tv;
    private boolean  homeTeather;
    private int width;
    private int height;
    private String color;

    //Constructor
    public LivingRoom(int windows, boolean tv, boolean homeTeather, int width, int height, String color) {
        this.windows = windows;
        this.tv = tv;
        this.homeTeather = homeTeather;
        this.width = width;
        this.height = height;
        this.color = color;
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

    //Builder

    public static LivingRoomBuilder builder(){
        return new LivingRoomBuilder();
    }
}
