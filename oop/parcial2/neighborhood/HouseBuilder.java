package oop.parcial2.neighborhood;

import java.util.List;

public class HouseBuilder {
    private Kitchen kitchen;
    private LivingRoom livingRoom;
    private DiningRoom diningRoom;
    private RestRoom restRoom;
    private BedRoom bedRoom;

    public HouseBuilder kitchen(Kitchen kitchen){
        this.kitchen=kitchen;
        return this;
    }
    public HouseBuilder livingRoom(LivingRoom livingRoom){
        this.livingRoom=livingRoom;
        return this;
    }
    public HouseBuilder diningRoom(DiningRoom diningRoom){
        this.diningRoom=diningRoom;
        return this;
    }
    public HouseBuilder restRoom(RestRoom restRoom){
        this.restRoom=restRoom;
        return this;
    }
    public HouseBuilder bedRoom(BedRoom bedRoom){
        this.bedRoom=bedRoom;
        return this;
    }
    //Build
    public House build(){
        return new House(kitchen,livingRoom,diningRoom,restRoom,bedRoom);
    }
}
