package com.driver;

public class Boat implements WaterVehicle {

    String name;
    int capacity;
    public Boat(String name,int capacity){
        this.name=name;
        this.capacity=capacity;

    }
    public void setName(String name){
        this.name=name;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }

    @Override
    public int getVehicleCapacity() {

        return this.capacity;
    }

    @Override
    public String getVehicleName() {
        return this.name;
    }
}
