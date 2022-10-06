package oop.parcial2.neighborhood;



public class BedRoom extends Room{
    private boolean tv;
    private BedSize bedSize;


    //Constructor
    public BedRoom(boolean tv, int width, int height, String color, BedSize bed_size) {
        super(width,height,color);
        this.tv = tv;
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

    //Builder
    public static BedRoomBuilder builder(){
        return new BedRoomBuilder();
    }
}
