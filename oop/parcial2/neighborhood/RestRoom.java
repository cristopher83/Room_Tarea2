package oop.parcial2.neighborhood;

public class RestRoom {
    private boolean showerCabin;
    private int width;
    private int height;
    private String color;

    //Constructor
    public RestRoom(boolean showerCabin, int width, int height, String color) {
        this.showerCabin = showerCabin;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    //Methods
    public boolean getShowerCabin()
    {
        return showerCabin;
    }
    public void setShowerCabin(boolean showerCabin)
    {
        this.showerCabin=showerCabin;
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

}
