package com.example.car_gen;

public class Honda extends Car{
    private boolean isTurboCharged;

    public Honda(){
        super("white", 2020, 120);
    }

    //Getter
    public boolean getIsTurboCharger(){
        return this.isTurboCharged;
    }
    public void setTurboCharged(boolean isTurboCharged){
        this.isTurboCharged = isTurboCharged;
    }

}
