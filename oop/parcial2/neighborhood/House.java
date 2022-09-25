package oop.parcial2.neighborhood;


public class House {
    private Kitchen kitchen;
    private LivingRoom livingRoom;
    private DiningRoom diningRoom;
    private RestRoom restRoom;
    private BedRoom bedRoom;


    //Main
    public static void main(String []args)
    {

    }

    //Constructor
    public House(Kitchen kitchen, LivingRoom livingRoom, DiningRoom diningRoom, RestRoom restRoom,BedRoom bedRoom){
        this.kitchen=kitchen;
        this.livingRoom=livingRoom;
        this.restRoom=restRoom;
        this.bedRoom=bedRoom;
        this.diningRoom=diningRoom;
    }


    //Methods
    public Kitchen getKitchen()
    {
        return kitchen;
    }
    public  void setKitchen(Kitchen kitchen) {this.kitchen=kitchen;}
    public DiningRoom getDinningRoom()
    {
        return diningRoom;
    }
    public void setDinningRoom(DiningRoom diningRoom)
    {
        this.diningRoom=diningRoom;
    }
    public LivingRoom getLivingRoom()
    {
        return livingRoom;
    }
    public void setLivingRoom(LivingRoom livingRoom)
    {
        this.livingRoom=livingRoom;
    }
    public RestRoom getRestRoom()
    {
        return restRoom;
    }
    public void setRestRoom(RestRoom restRoom)
    {
        this.restRoom=restRoom;
    }
    public BedRoom getBedroom() {return bedRoom;}
    public void setBedRoom(BedRoom bedRoom)
    {
        this.bedRoom=bedRoom;
    }

    //Builder

    public static HouseBuilder builder(){
        return new HouseBuilder();
    }


}
