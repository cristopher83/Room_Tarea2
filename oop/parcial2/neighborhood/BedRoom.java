package oop.parcial2.neighborhood;



public class BedRoom {
    private boolean tv;
    private int width;
    private int height;
    private String color;
    private BedSize bedSize;


    //Constructor
    public BedRoom(boolean tv, int width, int height, String color, BedSize bed_size) {
        this.tv = tv;
        this.width = width;
        this.height = height;
        this.color = color;
        this.bedSize = bed_size;
    }



    //Methods
    public BedSize getBedSize() {
        return bedSize;
    }
    public void setBedSize(BedSize bedSize)
    {
        this.bedSize = bedSize;
    }
    public  boolean getTv()
    {
        return tv;
    }
    public void setTv(boolean tv)
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

    //Builder
    public static BedRoomBuilder builder(){
        return new BedRoomBuilder();
    }
}
