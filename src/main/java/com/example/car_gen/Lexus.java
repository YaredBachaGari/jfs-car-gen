package com.example.car_gen;

public class Lexus extends Car{

    private boolean hasLeatherSeats;

    public Lexus(){
        super("red", 2020, 200);
    }

    //getter
    public boolean getHasLeatherSeat(){
        return this.hasLeatherSeats;
    }
    //Setter
    public void setHasLeatherSeats(boolean hasLeatherSeats){
        this.hasLeatherSeats = hasLeatherSeats;
    }

}
