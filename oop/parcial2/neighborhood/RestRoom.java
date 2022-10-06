package oop.parcial2.neighborhood;

public class RestRoom extends Room{
    private boolean showerCabin;


    //Constructor
    public RestRoom(boolean showerCabin, int width, int height, String color) {
        super(width,height,color);
        this.showerCabin = showerCabin;
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

}
